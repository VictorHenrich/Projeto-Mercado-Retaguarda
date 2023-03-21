
package controllers.lists.products;

import controllers.forms.products.ProductFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.produtos.Product;
import repositories.produtos.ProductRepository;
import view.lists.ProductListComponent;


public class ProductListController extends AbstractListController<ProductListComponent, Product>{

    public ProductListController() {
        super(
            new ProductListComponent(), 
            new ProductFormController(), 
            new ProductRepository()
        );
    }

    @Override
    protected ArrayList<String[]> getRows() {
       ArrayList<String[]> rows = new ArrayList();
        
        for(Product product: this.getRegisters()){
            String[] row = {
                "" + product.getId(), 
                product.getDescricao(),
                product.getBarraEntrada(),
                "" + product.getValorVenda(),
                "" + product.getUnidadeVenda()
            };
            
            rows.add(row);
        }
        
        return rows;
    }
    
}
