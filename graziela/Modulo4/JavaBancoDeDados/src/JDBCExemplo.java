import java.sql.Connection;
import java.sql.SQLException;

public class JDBCExemplo {
    public static void main(String[] args) {
    	try {
    		Connection conexao = new ConnectionFactory().getConnection();
    		conexao.close();
    	} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
    }
}
