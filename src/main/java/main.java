
import controllers.pessoas.CollaboratorFormController;

import view.CollaboratorFormComponent;



public class main {

    public static void main(String[] args) {
        CollaboratorFormComponent form = new CollaboratorFormComponent();
        
        CollaboratorFormController controller = new CollaboratorFormController(form);
    }
    
}
