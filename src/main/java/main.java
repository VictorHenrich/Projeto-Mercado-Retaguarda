
import controllers.pessoas.CollaboratorFormController;
import java.util.ArrayList;
import models.enderecos.Address;

import view.CollaboratorFormComponent;



public class main {

    public static void main(String[] args) {
        ArrayList<Address> addresses = new ArrayList();
        
        CollaboratorFormComponent form = new CollaboratorFormComponent();
        
        CollaboratorFormController controller = new CollaboratorFormController(form, addresses);
    }
    
}
