
package controllers.enderecos;

import controllers.builders.enderecos.AddressBuilder;
import models.enderecos.Address;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import repositories.enderecos.AddressRepository;



public class CRUDAddressController implements InterfaceCrudController<AddressBuilder, Address>{
    
    private final AddressRepository repository;

    public CRUDAddressController() {
        ArrayList<Address> address = new ArrayList();
        
        this.repository = new AddressRepository(address);
    }
    

    @Override
    public AddressBuilder newModelBuilder() {
        return new AddressBuilder();
    }

    @Override
    public void create(AddressBuilder register) {
        Address address = register.build(this.repository.nextID());
        
        this.repository.create(address);
        
        System.out.println("Endereço cadastrado com sucesso!");
    }

    @Override
    public void update(int id, AddressBuilder register) {
        Address address = register.build(id);
        
        this.repository.update(id, address);
        
        System.out.println("Endereço alterado com sucesso!");
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
        
        System.out.println("Endereço excluído com sucesso!");
    }

    @Override
    public AbstractList<Address> fetch() {
        return this.repository.fetch();
    }

    @Override
    public Address load(int id) {
        return this.load(id);
    }
    
}
