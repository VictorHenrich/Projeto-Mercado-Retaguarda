
package controllers.lists.address;

import controllers.forms.addresses.AddressFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.enderecos.Address;
import repositories.enderecos.AddressRepository;
import view.lists.AddressListComponent;


public class AddressListController extends AbstractListController<AddressListComponent, Address>{

    public AddressListController() {
        super(
            new AddressListComponent(),
            new AddressFormController(),
            new AddressRepository()
        );
    }

    

    @Override
    public ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(Address address: this.getRegisters()){
            String[] row = {
                "" + address.getId(), 
                address.getLogradouro(), 
                address.getBairro().getDescricao(), 
                address.getCidade().getDescricao(), 
                address.getCep()
            };
            
            rows.add(row);
        }
        
        return rows;
    }

    
}
