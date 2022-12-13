
import controllers.produtos.ClassFormController;
import view.ClassFormComponent;



public class main {

    public static void main(String[] args) {
         ClassFormComponent form = new ClassFormComponent();
        
        ClassFormController controller = new ClassFormController(form);
    }
    
}
