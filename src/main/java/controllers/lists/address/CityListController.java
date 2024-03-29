
package controllers.lists.address;

import controllers.forms.addresses.CityFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.address.City;
import repositories.address.CityRepository;
import view.lists.CityListComponent;


public class CityListController extends AbstractListController<CityListComponent, City>{

    public CityListController() {
        super(
            new CityListComponent(), 
            new CityFormController(), 
            new CityRepository()
        );
    }

    @Override
    public ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(City city: this.getRegisters()){
            String[] row = {"" + city.getId(), city.getDescricao()};
            
            rows.add(row);
        }
        
        return rows;
    }
    
}
