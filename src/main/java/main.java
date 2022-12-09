
import controllers.enderecos.CityFormController;
import view.CityFormComponent;


public class main {

    public static void main(String[] args) {
        CityFormComponent form = new CityFormComponent();
        
        CityFormController controller = new CityFormController(form);
    }
    
}
