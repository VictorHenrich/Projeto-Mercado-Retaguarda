
package controllers.lists.people;

import controllers.forms.people.SupplierFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.people.Supplier;
import repositories.people.SupplierRepository;
import view.lists.SupplierListComponent;


public class SupplierListController extends AbstractListController<SupplierListComponent, Supplier>{

    public SupplierListController() {
        super(
            new SupplierListComponent(), 
            new SupplierFormController(), 
            new SupplierRepository()
        );
    }

    @Override
    protected ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(Supplier supplier: this.getRegisters()){
            String[] row = {
                "" + supplier.getId(),
                supplier.getNome(),
                supplier.getRazaoSocial(),
                supplier.getCnpj().equals("") ? supplier.getCpf() : supplier.getCnpj(),
                supplier.getRg()
            };
            
            rows.add(row);
        }
        
        return rows;
    }
    
}
