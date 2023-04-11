
package repositories.people;
import database.DatabaseConnection;
import models.address.Address;
import models.address.City;
import models.address.District;
import repositories.exceptions.CollaboratorRepositoryError;
import repositories.patterns.CrudRepository;
import models.people.Collaborator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CollaboratorRepository implements CrudRepository<Collaborator>{
    private final String collaboratorDefaultQuery =
            "SELECT c.*, e.cep AS endereco_cep, " +
            "e.logradouro AS endereco_logradouro, e.cidade_id, e.bairro_id, " +
            "ci.descricao AS cidade_descricao, b.descricao AS bairro_descricao " +
            "FROM colaboradores AS c " +
            "INNER JOIN enderecos AS e ON e.id = c.endereco_id " +
            "INNER JOIN cidades AS ci ON ci.id = e.cidade_id " +
            "INNER JOIN bairros AS b ON b.id = e.bairro_id ";

    private Collaborator handleCollaboratorResult(ResultSet result) throws Exception{
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
                result.getInt("id")
        );

        return new Collaborator(
                result.getString("login"),
                result.getString("senha"),
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
    public void create(Collaborator register) throws CollaboratorRepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = "INSERT INTO colaboradores " +
                "(id, nome, fone1, fone2, endereco_complemento, endereco_id, " +
                "email, observacao, status, login, senha) " +
                "VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getNome());
            ps.setString(2, register.getFone1());
            ps.setString(3, register.getFone2());
            ps.setString(4, register.getComplementoEndereco());
            ps.setInt(5, register.getEndereco().getId());
            ps.setString(6, register.getEmail());
            ps.setString(7, register.getObservacao());
            ps.setString(8, "" + register.getStatus());
            ps.setString(9, register.getLogin());
            ps.setString(10, register.getSenha());

            ps.executeUpdate();

        }catch(Exception error){
            throw new CollaboratorRepositoryError("INSERÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void update(int id, Collaborator register) throws CollaboratorRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql =
                "UPDATE colaboradores SET " +
                "nome = ?, fone1 = ?, fone2 = ?, endereco_complemento = ?, endereco_id = ?, " +
                "email = ?, observacao = ?, status = ?, login = ?, senha = ? " +
                "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getNome());
            ps.setString(2, register.getFone1());
            ps.setString(3, register.getFone2());
            ps.setString(4, register.getComplementoEndereco());
            ps.setInt(5, register.getEndereco().getId());
            ps.setString(6, register.getEmail());
            ps.setString(7, register.getObservacao());
            ps.setString(8, "" + register.getStatus());
            ps.setString(9, register.getLogin());
            ps.setString(10, register.getSenha());
            ps.setInt(11, register.getId());

            ps.executeUpdate();

        }catch(Exception error){
            throw new CollaboratorRepositoryError("ATUALIZAÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws CollaboratorRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "DELETE FROM colaboradores WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new CollaboratorRepositoryError("EXCLUSÃO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Collaborator load(int id) throws CollaboratorRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.collaboratorDefaultQuery + "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleCollaboratorResult(result);

        }catch(Exception error){
            throw new CollaboratorRepositoryError("CARREGAMENTO", error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Collaborator> fetch() throws CollaboratorRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Collaborator> collaborators = new ArrayList<Collaborator>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.collaboratorDefaultQuery);

            while(result.next()){
                collaborators.add(this.handleCollaboratorResult(result));
            }

        }catch(Exception error){
            throw new CollaboratorRepositoryError("LISTAGEM", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return collaborators;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
