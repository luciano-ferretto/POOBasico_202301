package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.h2.tools.Server;

public class H2Server { 
    public static void startH2Server() {
        Server server = null;
        try {
            server = Server.createTcpServer("-tcpAllowOthers").start();
            
            System.out.println("Servidor H2 iniciado e rodando na porta: " + server.getPort());
            System.out.println(server.getURL());
            // Configuração do banco de dados
            String url = "jdbc:h2:./data/test";
            // Conecta-se ao banco de dados
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");

            // Cria uma tabela de exemplo
            String createTableQuery = "CREATE TABLE IF NOT EXISTS produtos (id INT PRIMARY KEY, nome VARCHAR(50))";
            Statement statement = connection.createStatement();
            statement.executeUpdate(createTableQuery);
            System.out.println("Tabela criada com sucesso!");

            // Fecha os recursos
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
