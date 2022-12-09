
import controllers.enderecos.AddressFormController;
import java.util.ArrayList;
import models.enderecos.City;
import models.enderecos.District;

import view.AddressFormComponent;



public class main {

    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList();
        ArrayList<District> districts = new ArrayList();
        
        cities.add(new City("TESTE1", 0));
        cities.add(new City("TESTE2", 1));
        cities.add(new City("TESTE3", 2));
        
        districts.add(new District("TESTE1", 0));
        districts.add(new District("TESTE2", 1));
        districts.add(new District("TESTE3", 2));
        
        AddressFormComponent form = new AddressFormComponent();
        
        AddressFormController controller = new AddressFormController(form, cities, districts);
    }
    
}
