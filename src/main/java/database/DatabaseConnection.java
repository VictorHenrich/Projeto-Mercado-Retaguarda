
package database;

import java.sql.Connection;
import java.sql.DriverManager;



public class DatabaseConnection {
    
    private static final String host = "localhost";
    private static final String port = "5432";
    private static final String dbname = "projeto_mercado";
    private static final String username = "postgres";
    private static final String password = "1234";
    
    public static Connection createConnection(){
        try{
            String url = "jdbc:postgresql://" + 
                        DatabaseConnection.host + ":" + 
                        DatabaseConnection.port + "/" + 
                        DatabaseConnection.dbname;
            
            return DriverManager.getConnection(
                        url, 
                        DatabaseConnection.username, 
                        DatabaseConnection.password
                    );
            
        }catch(Exception error){
            System.out.println("Falha ao conectar no banco de dados" + error.getMessage());
        }
        
        return null;
    }
    
    public static void closeConnection(Connection connection){
       try{
           connection.close();
       }catch(Exception error){
           System.out.println("Falha ao fechar conexão com banco de dados!");
       }
    }
}
