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
			e.printStackTrace();
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

	private static void menuLogado(Connection conexao) {
		int opcaoMenu = 0;
		while(opcaoMenu != 3) {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Gerenciamento de usuário"
																	+ "\n1 - Livros"
																	+ "\n2 - Empréstimos"
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

	private static void menuLogadoAdmin(Connection conexao) throws SQLException {
		int opcaoMenu = 0;
		while(opcaoMenu != 4) {
			opcaoMenu = Integer.parseInt(JOptionPane.showInputDialog("Gerenciamento de usuário"
																	+ "\n1 - Livros"
																	+ "\n2 - Empréstimos"
																	+ "\n3 - Remover Usuário"
																	+ "\n4 - Voltar"));
			switch (opcaoMenu) {
				case 1:
					
					break;
				case 2:
					
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
}
