
package controllers.lists.address;

import controllers.forms.addresses.DistrictFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.enderecos.District;
import repositories.enderecos.DistrictRepository;
import view.lists.DistrictListComponent;


public class DistrictListController extends AbstractListController<DistrictListComponent, District>{

    public DistrictListController() {
        super(
            new DistrictListComponent(), 
            new DistrictFormController(), 
            new DistrictRepository()
        );
    }

    @Override
    public ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(District district: this.registers){
            String[] row = {"" + district.getId(), district.getDescricao()};
            
            rows.add(row);
        }
        
        return rows;
    }
    
}
