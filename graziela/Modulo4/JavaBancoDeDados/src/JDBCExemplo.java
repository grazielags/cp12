import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JDBCExemplo {
	public static int idUsuarioLogado;
	public static boolean isAdmin;

    public static void main(String[] args) {
    	try {
    		Connection conexao = new ConnectionFactory().getConnection();
    		int opcaoMenu = 0;
    		while(opcaoMenu != 4) {
    			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Gerenciamento de usuário"
    																	+ "\n1 - Cadastrar"
    																	+ "\n2 - Consultar"
    																	+ "\n3 - Logar"
    																	+ "\n4 - Sair"));
    			switch (opcaoMenu) {
					case 1:
						cadastrarUsuario(conexao);
						break;
					case 2:
						consultarUsuario(conexao);
						break;
					case 3:
						logar(conexao);
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Saindo!");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida!");
						break;
				}
    		}
    		
    		conexao.close();
    	} catch (SQLException e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
		}
    }

	private static void logar(Connection conexao) throws SQLException {
		String login = JOptionPane.showInputDialog("Digite o login!");
		String senha = JOptionPane.showInputDialog("Digite a senha!");
		
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id, perfil ");
		sql.append("FROM usuario ");
		sql.append("WHERE login = ?");
		sql.append("AND senha = ?");
		PreparedStatement stmt = conexao.prepareStatement(sql.toString());
		stmt.setString(1, login);
		stmt.setString(2, senha);

		// executa
		ResultSet resultado = stmt.executeQuery();
		boolean isLogado = false;
		while (resultado.next()) {
			idUsuarioLogado = resultado.getInt("id");
			isAdmin = resultado.getInt("perfil") == 1;
			isLogado = true;
		}

		if (isLogado == true) {
			if (isAdmin) {
				menuLogadoAdmin(conexao);
			} else {
				menuLogado(conexao);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Usuário não existe!");
		}
	}

	private static void menuLogado(Connection conexao) throws SQLException {
		int opcaoMenu = 0;
		while(opcaoMenu != 3) {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("1 - Livros"
																	+ "\n2 - Empréstimos"
																	+ "\n3 - Voltar"));
			switch (opcaoMenu) {
				case 1:
					menuLivros(conexao);
					break;
				case 2:
					menuEmprestimo(conexao);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Voltando!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
			}
		}
	}

	private static void menuLogadoAdmin(Connection conexao) throws SQLException {
		int opcaoMenu = 0;
		while(opcaoMenu != 4) {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("1 - Livros"
																	+ "\n2 - Empréstimos"
																	+ "\n3 - Remover Usuário"
																	+ "\n4 - Voltar"));
			switch (opcaoMenu) {
				case 1:
					if (isAdmin == true) {
						menuLivrosAdmin(conexao);
					} else {
						menuLivros(conexao);
					}
					break;
				case 2:
					menuEmprestimo(conexao);
					break;
				case 3:
					removerUsuario(conexao);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Voltando!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
			}
		}
	}

	private static void menuEmprestimo(Connection conexao) {
		int opcaoMenu = 0;
		while(opcaoMenu != 3) {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Gerenciamento de Empréstimos"
																	+ "\n1 - Realizar empréstimo"
																	+ "\n2 - Devolver livro"
																	+ "\n3 - Voltar"));
			switch (opcaoMenu) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Voltando!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
			}
		}
	}

	private static void menuLivrosAdmin(Connection conexao) throws SQLException {
		int opcaoMenu = 0;
		while(opcaoMenu != 4) {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Gerenciamento de livros"
																	+ "\n1 - Consultar"
																	+ "\n2 - Cadastrar"
																	+ "\n3 - Remover"
																	+ "\n4 - Voltar"));
			switch (opcaoMenu) {
				case 1:
					listarLivros(conexao);
					break;
				case 2:
					cadastrarLivros(conexao);
					break;
				case 3:
					removerLivro(conexao);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Voltando!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
			}
		}
	}

	private static void menuLivros(Connection conexao) throws SQLException {
		int opcaoMenu = 0;
		while(opcaoMenu != 2) {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Gerenciamento de livros"
					+ "\n1 - Consultar"
					+ "\n2 - Voltar"));
			switch (opcaoMenu) {
			case 1:
				listarLivros(conexao);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Voltando!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				break;
			}
		}
	}

	private static void removerUsuario(Connection conexao) throws SQLException {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do usuário que deseja remover!"));
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM usuario ");
		sql.append("WHERE id = ?");
		PreparedStatement stmt = conexao.prepareStatement(sql.toString());
		stmt.setInt(1, id);

		// executa
		if (stmt.executeUpdate() > 0) {
			JOptionPane.showMessageDialog(null, "Removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Usuário não existe na base!");
		}
		stmt.close();
	}

	private static void consultarUsuario(Connection conexao) throws SQLException {
		String nome = JOptionPane.showInputDialog("Digite parte do nome do usuário que deseja buscar");
		ResultSet lista = listarUsuario(conexao, nome);
		
		StringBuilder saida = new StringBuilder("");
		while (lista.next()) {
			saida.append("Id: " + lista.getString("id"));
			saida.append("\nNome: " + lista.getString("nome"));
			saida.append("\nEndereço: " + lista.getString("endereco"));
			saida.append("\nPerfil: " + lista.getString("perfil"));
			saida.append("\nLogin: " + lista.getString("login"));
			saida.append("\n\n");
		}
		//JOptionPane.showMessageDialog(null, saida.toString());
		JTextArea textArea = new JTextArea(saida.toString());
		JScrollPane scrollPane = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
		JOptionPane.showMessageDialog(null, scrollPane, "Listagem de usuários!",  
		                                       JOptionPane.DEFAULT_OPTION);
	}
	
	public static ResultSet listarUsuario(Connection conexao, String nome) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id, nome, ");
		sql.append("CASE WHEN endereco IS NULL THEN '' ELSE endereco END endereco, ");
		sql.append("CASE WHEN perfil = 1 THEN 'Admin' ELSE 'Usuário normal' END perfil, ");
		sql.append("login ");
		sql.append("FROM usuario ");
		sql.append("WHERE UPPER(nome) like ?");
		PreparedStatement stmt = conexao.prepareStatement(sql.toString());
		stmt.setString(1, "%" + nome.toUpperCase() + "%");

		// executa
		return stmt.executeQuery();
	}

	private static void cadastrarUsuario(Connection conexao) throws SQLException {
		String nome = JOptionPane.showInputDialog("Digite o nome!");
		String endereco = JOptionPane.showInputDialog("Digite o endereço!");
		int perfil = Integer.parseInt(JOptionPane.showInputDialog("Digite o perfil (1 - Admin, 2 - Usuário normal)"));
		String login = JOptionPane.showInputDialog("Digite o login!");
		String senha = JOptionPane.showInputDialog("Digite a senha!");
		
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO usuario ");
		sql.append("	(nome, endereco, perfil, login, senha) ");
		sql.append("values ");
		sql.append("	(?, ?, ?, ?, ?)");
		PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString());
		preparedStatement.setString(1, nome);
		preparedStatement.setString(2, endereco);
		preparedStatement.setInt(3, perfil);
		preparedStatement.setString(4, login);
		preparedStatement.setString(5, senha);
		
		// executa
		preparedStatement.execute();
		preparedStatement.close();
		JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");
	}

	private static void cadastrarLivros(Connection conexao) throws SQLException {
		String nome = JOptionPane.showInputDialog("Digite o nome do livro!");
		String autor = JOptionPane.showInputDialog("Digite o nome do autor!");
		int anoEdicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de edicao!"));

		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO livro ");
		sql.append("	(nome, autor, ano_edicao) ");
		sql.append("values ");
		sql.append("	(?, ?, ?)");
		PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString());
		preparedStatement.setString(1, nome);
		preparedStatement.setString(2, autor);
		preparedStatement.setInt(3, anoEdicao);

		// executa
		preparedStatement.execute();
		preparedStatement.close();
	}

	private static void listarLivros(Connection conexao) throws SQLException {
		String nome;
		nome = JOptionPane.showInputDialog("Digite parte do nome do livro que deseja buscar");
		ResultSet lista = listarLivros(conexao, nome);
		
		StringBuilder saida = new StringBuilder("");
		while (lista.next()) {
			saida.append("Id: " + lista.getString("id"));
			saida.append("\nNome: " + lista.getString("nome"));
			saida.append("\nAutor: " + lista.getString("autor"));
			saida.append("\nAno edição: " + lista.getInt("ano_edicao"));
			saida.append("\nSitução: " + lista.getString("situacao"));
			saida.append("\n\n");
		}
		// JOptionPane.showMessageDialog(null, saida.toString());
		JTextArea textArea = new JTextArea(saida.toString());
		JScrollPane scrollPane = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
		JOptionPane.showMessageDialog(null, scrollPane, "Listagem de livros!",  
		                                       JOptionPane.YES_NO_OPTION);
	}
	
	private static ResultSet listarLivros(Connection conexao, String nome) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT l.*, ");
		sql.append("CASE WHEN (e.id IS NOT NULL) THEN 'Emprestado' ELSE 'Disponivel' END situacao ");
		sql.append("FROM livro l ");
		sql.append("LEFT JOIN emprestimo e ON e.id_livro = l.id ");
		sql.append("WHERE UPPER(l.nome) like ?");
		PreparedStatement stmt = conexao.prepareStatement(sql.toString());
		stmt.setString(1, "%" + nome.toUpperCase() + "%");

		// executa
		return stmt.executeQuery();
	}

	private static void removerLivro(Connection conexao) throws SQLException {
		Integer idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro que deseja remover!"));
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM livro ");
		sql.append("WHERE id = ?");
		PreparedStatement stmt = conexao.prepareStatement(sql.toString());
		stmt.setInt(1, idLivro);

		// executa
		if (stmt.executeUpdate() > 0) {
			JOptionPane.showMessageDialog(null, "Removido com sucesso!");
		}
		stmt.close();
	}

	private static void realizarEmprestimo(Connection conexao) {
		try {
			int idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro!"));
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO emprestimo ");
			sql.append("	(id_usuario, id_livro) ");
			sql.append("values ");
			sql.append("	(?, ?)");
			PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString());
			preparedStatement.setInt(1, idUsuarioLogado);
			preparedStatement.setInt(2, idLivro);

			// executa
			preparedStatement.execute();
			preparedStatement.close();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	private static void devolverEmprestimo(Connection conexao) {
		try {
			int idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro que deseja devolver!"));
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM emprestimo ");
			sql.append("WHERE id_usuario = ? ");
			sql.append("AND id_livro = ? ");
			PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString());
			preparedStatement.setInt(1, idUsuarioLogado);
			preparedStatement.setInt(2, idLivro);

			// executa
			preparedStatement.execute();
			preparedStatement.close();
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
