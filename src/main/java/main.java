
import controllers.pessoas.SupplierFormController;
import view.SupplierFormComponent;



public class main {

    public static void main(String[] args) {
         SupplierFormComponent form = new SupplierFormComponent();
        
        SupplierFormController controller = new SupplierFormController(form);
    }
    
}
