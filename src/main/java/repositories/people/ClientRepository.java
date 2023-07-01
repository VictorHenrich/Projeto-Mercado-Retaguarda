
package repositories.people;
import database.DatabaseConnection;
import models.address.Address;
import models.address.City;
import models.address.District;
import models.people.Client;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClientRepository extends AbstractCrudRepository<Client> {

    private final String clientDefaultQuery = "SELECT c.*, e.cep AS endereco_cep, " +
                                              "e.logradouro AS endereco_logradouro, e.cidade_id, e.bairro_id, " +
                                              "ci.descricao AS cidade_descricao, b.descricao AS bairro_descricao " +
                                              "FROM clientes AS c " +
                                              "INNER JOIN enderecos AS e ON e.id = c.endereco_id " +
                                              "INNER JOIN cidades AS ci ON ci.id = e.cidade_id " +
                                              "INNER JOIN bairros AS b ON b.id = e.bairro_id ";

    private Client handleClientResult(ResultSet result) throws Exception{
        City city = new City(
                result.getString("cidade_descricao"),
                result.getInt("cidade_id")
        );

        District district = new District(
                result.getString("bairro_descricao"),
                result.getInt("bairro_id")
        );

        Address address = new Address(
                result.getString("endereco_logradouro"),
                result.getString("endereco_cep"),
                city,
                district,
                result.getInt("endereco_id")
        );

        return new Client(
                result.getString("cpf"),
                result.getString("rg"),
                result.getDate("data_nascimento"),
                result.getString("sexo").charAt(0),
                result.getString("nome"),
                result.getString("fone1"),
                result.getString("fone2"),
                result.getString("endereco_complemento"),
                address,
                result.getString("email"),
                result.getString("observacao"),
                result.getString("status").charAt(0),
                result.getInt("id")
        );
    }

    @Override
    public Client load(int id) throws RepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.clientDefaultQuery + "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleClientResult(result);

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Client> fetch() throws RepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Client> clients = new ArrayList<Client>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.clientDefaultQuery);

            while(result.next()){
                clients.add(this.handleClientResult(result));
            }

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.FETCH, error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return clients;
    }
}
