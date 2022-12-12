
import controllers.pessoas.CollaboratorFormController;
import java.util.ArrayList;
import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;

import view.CollaboratorFormComponent;



public class main {

    public static void main(String[] args) {
        ArrayList<Address> addresses = new ArrayList();
        ArrayList<City> cities = new ArrayList();
        ArrayList<District> districts = new ArrayList();
        
        cities.add(new City("AAAA", 1));
        cities.add(new City("CCCCC", 2));
        cities.add(new City("DDDDD", 3));
        
        districts.add(new District("RRRR", 1));
        districts.add(new District("VVVVV", 2));
        districts.add(new District("TTTTT", 3));
        
        addresses.add(new Address("LOGRAODURO", "123", cities.get(0), districts.get(0), 0));
        addresses.add(new Address("LOGRAODURO", "345", cities.get(1), districts.get(1), 2));
        addresses.add(new Address("LOGRAODURO", "567", cities.get(2), districts.get(2), 2));
        addresses.add(new Address("LOGRAODURO", "890", cities.get(2), districts.get(0), 1));
        
        CollaboratorFormComponent form = new CollaboratorFormComponent();
        
        CollaboratorFormController controller = new CollaboratorFormController(form, cities, districts, addresses);
    }
    
}
