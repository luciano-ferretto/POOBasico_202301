import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    public static Connection conexao;
    static {
        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db_9135", "postgres", "postgres");
            System.out.println("Conexão com o banco de dados estabelecida.");
        } catch (SQLException e) {
            System.out.println("Não foi possível estabelecer conexão com o banco de dados.");
            e.printStackTrace();
        }
    }
}
