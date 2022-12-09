
import controllers.enderecos.AddressFormController;
import java.util.ArrayList;
import models.enderecos.City;
import models.enderecos.District;

import view.AddressFormComponent;



public class main {

    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList();
        ArrayList<District> districts = new ArrayList();
        
        AddressFormComponent form = new AddressFormComponent();
        
        AddressFormController controller = new AddressFormController(form, cities, districts);
    }
    
}
