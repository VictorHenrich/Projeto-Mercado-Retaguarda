
import models.enderecos.City;
import repositories.enderecos.CityRepository;


public class main_test {

    public static void main(String[] args) {
        
        CityRepository c = new CityRepository();
        
        c.create(new City("Teste", 0));
    }
    
}
