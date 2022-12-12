
import controllers.enderecos.AddressFormController;
import view.AddressFormComponent;



public class main {

    public static void main(String[] args) {
         AddressFormComponent form = new AddressFormComponent();
        
        AddressFormController controller = new AddressFormController(form);
    }
    
}
