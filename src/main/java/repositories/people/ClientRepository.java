
package repositories.people;
import database.DatabaseConnection;
import models.address.Address;
import models.address.City;
import models.address.District;
import models.people.Client;
import repositories.exceptions.ClientRepositoryError;
import repositories.patterns.CrudRepository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClientRepository implements CrudRepository<Client>{

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
    public void create(Client register) throws ClientRepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = "INSERT INTO clientes " +
                     "(id, nome, fone1, fone2, endereco_complemento, endereco_id, " +
                     "email, observacao, status, cpf, rg, data_nascimento, sexo) " +
                     "VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            Date date = new Date(register.getDataNascimento().getTime());

            ps.setString(1, register.getNome());
            ps.setString(2, register.getFone1());
            ps.setString(3, register.getFone2());
            ps.setString(4, register.getComplementoEndereco());
            ps.setInt(5, register.getEndereco().getId());
            ps.setString(6, register.getEmail());
            ps.setString(7, register.getObservacao());
            ps.setString(8, "" + register.getStatus());
            ps.setString(9, register.getCpf());
            ps.setString(10, register.getRg());
            ps.setDate(11, date);
            ps.setString(12, ""+ register.getSexo());

            ps.executeUpdate();

        }catch(Exception error){
            throw new ClientRepositoryError("INSERÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }

    }

    @Override
    public void update(int id, Client register) throws ClientRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "UPDATE clientes SET " +
                "nome = ?, fone1 = ?, fone2 = ?, endereco_complemento = ?, endereco_id = ?, " +
                "email = ?, observacao = ?, status = ?, cpf = ?, rg = ?, data_nascimento = ?, sexo = ? " +
                "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            Date date = new Date(register.getDataNascimento().getTime());

            ps.setString(1, register.getNome());
            ps.setString(2, register.getFone1());
            ps.setString(3, register.getFone2());
            ps.setString(4, register.getComplementoEndereco());
            ps.setInt(5, register.getEndereco().getId());
            ps.setString(6, register.getEmail());
            ps.setString(7, register.getObservacao());
            ps.setString(8, "" + register.getStatus());
            ps.setString(9, register.getCpf());
            ps.setString(10, register.getRg());
            ps.setDate(11, date);
            ps.setString(12, ""+ register.getSexo());
            ps.setInt(13, id);

            ps.executeUpdate();

        }catch(Exception error){
            throw new ClientRepositoryError("ATUALIZAÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws ClientRepositoryError{

        Connection connection = DatabaseConnection.createConnection();

        String sql = "DELETE FROM clientes WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new ClientRepositoryError("EXCLUSÃO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Client load(int id) throws ClientRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.clientDefaultQuery + "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleClientResult(result);

        }catch(Exception error){
            throw new ClientRepositoryError("CARREGAMENTO", error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Client> fetch() throws ClientRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Client> clients = new ArrayList<Client>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.clientDefaultQuery);

            while(result.next()){
                clients.add(this.handleClientResult(result));
            }

        }catch(Exception error){
            throw new ClientRepositoryError("LISTAGEM", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return clients;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
