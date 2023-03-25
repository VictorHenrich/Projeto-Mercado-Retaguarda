
package repositories.address;

import database.DatabaseConnection;
import models.address.Address;
import models.address.City;
import models.address.District;
import repositories.exceptions.AddressRepositoryError;
import repositories.patterns.CrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class AddressRepository implements CrudRepository<Address>{

    private Address handleAddressResult(ResultSet result) throws Exception{
        City city = new City(
                result.getString("cidade_descricao"),
                result.getInt("cidade_id")
        );

        District district = new District(
                result.getString("bairro_descricao"),
                result.getInt("bairro_id")
        );

        return new Address(
                result.getString("logradouro"),
                result.getString("cep"),
                city,
                district,
                result.getInt("id")
        );
    }

    @Override
    public void create(Address register) throws AddressRepositoryError {
        String sql = "INSERT INTO enderecos (id, logradouro, cep, cidade_id, bairro_id) " +
                    "VALUES (DEFAULT, ?, ?, ?, ?)";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getLogradouro());
            ps.setString(2, register.getCep());
            ps.setInt(3, register.getCidade().getId());
            ps.setInt(4, register.getBairro().getId());
            ps.executeUpdate();

        }catch(Exception error){
            throw new AddressRepositoryError("CADASTRO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

    }

    @Override
    public void update(int id, Address register) throws AddressRepositoryError{
        String sql = "UPDATE enderecos SET " +
                    "logradouro = ?, " +
                    "cep = ?, " +
                    "cidade_id = ?, " +
                    "bairro_id = ? " +
                    "WHERE id = ?";

        Connection connection = DatabaseConnection.createConnection();

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getLogradouro());
            ps.setString(2, register.getCep());
            ps.setInt(3, register.getCidade().getId());
            ps.setInt(4, register.getBairro().getId());
            ps.setInt(5, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new AddressRepositoryError("ATUALIZAÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

    }

    @Override
    public void delete(int id) throws AddressRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "DELETE FROM enderecos WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new AddressRepositoryError("EXCLUSÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Address load(int id) throws AddressRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "SELECT e.*, c.descricao AS cidade_descricao, b.descricao AS bairro_descricao" +
                      "FROM enderecos AS e " +
                      "INNER JOIN cidades AS c ON e.cidade_id = c.id" +
                      "INNER JOIN bairros AS b ON e.bairro_id = b.id" +
                      "WHERE e.id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleAddressResult(result);

        }catch(Exception error){
            throw new AddressRepositoryError("CARREGAR", error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Address> fetch() throws AddressRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Address> addresses = new ArrayList<Address>();

        String sql = "SELECT e.*, c.descricao AS cidade_descricao, b.descricao AS bairro_descricao " +
                "FROM enderecos AS e " +
                "INNER JOIN cidades AS c ON e.cidade_id = c.id " +
                "INNER JOIN bairros AS b ON e.bairro_id = b.id";

        try{
            ResultSet result = connection
                                    .createStatement()
                                    .executeQuery(sql);

            while(result.next()){
                addresses.add(
                        this.handleAddressResult(result)
                );
            }

        }catch(Exception error){
            throw new AddressRepositoryError("LISTAR", error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return addresses;
    }

    @Override
    public int nextID() {
        return 0;
    }


}
