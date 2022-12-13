
import controllers.produtos.ProductFormController;
import view.ProductFormComponent;



public class main {

    public static void main(String[] args) {
         ProductFormComponent form = new ProductFormComponent();
        
        ProductFormController controller = new ProductFormController(form);
    }
    
}
