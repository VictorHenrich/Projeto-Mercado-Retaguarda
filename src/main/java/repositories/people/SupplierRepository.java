
package repositories.people;
import database.DatabaseConnection;
import models.address.Address;
import models.address.City;
import models.address.District;
import repositories.exceptions.SupplierRepositoryError;
import repositories.patterns.CrudRepository;
import models.people.Supplier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class SupplierRepository implements CrudRepository<Supplier>{
    private final String supplierDefaultQuery = "SELECT f.*, e.cep AS endereco_cep, " +
            "e.logradouro AS endereco_logradouro, e.cidade_id, e.bairro_id, " +
            "ci.descricao AS cidade_descricao, b.descricao AS bairro_descricao " +
            "FROM fornecedores AS f " +
            "INNER JOIN enderecos AS e ON e.id = f.endereco_id " +
            "INNER JOIN cidades AS ci ON ci.id = f.cidade_id " +
            "INNER JOIN bairros AS b ON b.id = f.bairro_id ";

    private Supplier handleSupplierResult(ResultSet result) throws Exception{
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

        return new Supplier(
                result.getString("cnpj"),
                result.getString("ie"),
                result.getString("contato"),
                result.getString("razao_social"),
                result.getString("cpf"),
                result.getString("rg"),
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
    public void create(Supplier register) throws SupplierRepositoryError {
        Connection connection = DatabaseConnection.createConnection();

        String sql = "INSERT INTO fornecedores " +
                "(id, razao_social, nome, fone1, fone2, endereco_complemento, endereco_id, " +
                "email, observacao, status, cpf, rg, ie, contato, cnpj) " +
                "VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getRazaoSocial());
            ps.setString(2, register.getNome());
            ps.setString(3, register.getFone1());
            ps.setString(4, register.getFone2());
            ps.setString(5, register.getComplementoEndereco());
            ps.setInt(6, register.getEndereco().getId());
            ps.setString(7, register.getEmail());
            ps.setString(8, register.getObservacao());
            ps.setString(9, "" + register.getStatus());
            ps.setString(10, register.getCpf());
            ps.setString(11, register.getRg());
            ps.setString(12, register.getInscricaoEstadual());
            ps.setString(13, register.getContato());
            ps.setString(14, ""+ register.getCnpj());

            ps.executeUpdate();

        }catch(Exception error){
            throw new SupplierRepositoryError("INSERÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void update(int id, Supplier register) throws SupplierRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "INSERT INTO fornecedores SET" +
                "id = ?, razao_social = ?, nome = ?, fone1 = ?, fone2 =?," +
                "endereco_complemento = ?, endereco_id = ?, email = ?, observacao = ?, status = ?, " +
                "cpf = ?, rg = ?, ie = ?, contato = ?, cnpj = ? " +
                "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, register.getRazaoSocial());
            ps.setString(2, register.getNome());
            ps.setString(3, register.getFone1());
            ps.setString(4, register.getFone2());
            ps.setString(5, register.getComplementoEndereco());
            ps.setInt(6, register.getEndereco().getId());
            ps.setString(7, register.getEmail());
            ps.setString(8, register.getObservacao());
            ps.setString(9, "" + register.getStatus());
            ps.setString(10, register.getCpf());
            ps.setString(11, register.getRg());
            ps.setString(12, register.getInscricaoEstadual());
            ps.setString(13, register.getContato());
            ps.setString(14, register.getCnpj());
            ps.setInt(15, register.getId());

            ps.executeUpdate();

        }catch(Exception error){
            throw new SupplierRepositoryError("ATUALIZAÇÃO", error);
        }finally {
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public void delete(int id) throws SupplierRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = "DELETE FROM fornecedores WHERE id = ?";

        try{
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

        }catch(Exception error){
            throw new SupplierRepositoryError("EXCLUSÃO", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Supplier load(int id) throws SupplierRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        String sql = this.supplierDefaultQuery + "WHERE id = ?";

        try{

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet result = ps.executeQuery();

            return this.handleSupplierResult(result);

        }catch(Exception error){
            throw new SupplierRepositoryError("CARREGAMENTO", error);

        }finally{
            DatabaseConnection.closeConnection(connection);
        }
    }

    @Override
    public Iterable<Supplier> fetch() throws SupplierRepositoryError{
        Connection connection = DatabaseConnection.createConnection();

        ArrayList<Supplier> suppliers = new ArrayList<Supplier>();

        try{
            ResultSet result = connection.createStatement().executeQuery(this.supplierDefaultQuery);

            while(result.next()){
                suppliers.add(this.handleSupplierResult(result));
            }

        }catch(Exception error){
            throw new SupplierRepositoryError("LISTAGEM", error);
        }finally{
            DatabaseConnection.closeConnection(connection);
        }

        return suppliers;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
