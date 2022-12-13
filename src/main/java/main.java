
import controllers.produto.BrandFormController;
import view.BrandFormComponent;



public class main {

    public static void main(String[] args) {
         BrandFormComponent form = new BrandFormComponent();
        
        BrandFormController controller = new BrandFormController(form);
    }
    
}
