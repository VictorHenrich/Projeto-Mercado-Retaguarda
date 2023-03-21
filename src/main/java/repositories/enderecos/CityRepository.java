
package repositories.enderecos;

import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.enderecos.City;
import repositories.patterns.CrudRepository;


public class CityRepository implements CrudRepository<City>{

    @Override
    public void create(City register) {
        try{
            
            String sql = "INSERT INTO cidades (id, descricao) VALUES(DEFAULT, ?)";
                      
            Connection connection = DatabaseConnection.createConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.executeUpdate();
            
            System.out.println("Cidade cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar cidade!" + error.getMessage());
        }
    }

    @Override
    public void update(int id, City register) {
        try{
            
            String sql = "UPDATE cidades SET descricao = ? WHERE id = ?";
                      
            Connection connection = DatabaseConnection.createConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getDescricao());
            ps.setInt(2, id);
            ps.executeUpdate();
            
            System.out.println("Cidade alterada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterada cidade!" + error.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        try{
            String sql = "DELETE FROM cidades WHERE id = ?";

            Connection connection = DatabaseConnection.createConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Cidade excluida com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao tentar excluir a cidade!" + error.getMessage());
        }
    }

    @Override
    public City load(int id) {
        try{
            String sql = "SELECT c.descricao, c.id FROM cidades AS c WHERE id = ?";
                      
            Connection connection = DatabaseConnection.createConnection();

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(0, id);
            
            ResultSet result = ps.executeQuery();
            
            DatabaseConnection.closeConnection(connection);
            
            return new City(
                result.getString("descricao"),
                    result.getInt("id")
            );
            
        }catch(Exception error){
            System.out.println("Falha ao localizar cidade!");
        }
        
        return null;
    }

    @Override
    public Iterable<City> fetch() {
        ArrayList<City> cities = new ArrayList<City>();
        
        try{
            String sql = "SELECT c.id, c.descricao FROM cidades AS c";
                      
            Connection connection = DatabaseConnection.createConnection();

            ResultSet result = connection.createStatement().executeQuery(sql);

            while(result.next()){
                City city = new City(
                    result.getString("descricao"), 
                    result.getInt("id")
                );
                
                cities.add(city);
            }
            
        }catch(Exception error){
            System.out.println("Falha ao localizar as cidades!" + error.getMessage());
        }

        return cities;
    }

    @Override
    public int nextID() {
        return 0;
    }


}
