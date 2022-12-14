
package controllers.lists.products;

import controllers.forms.products.BrandFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.produtos.Brand;
import repositories.produtos.BrandRepository;
import view.lists.BrandListComponent;


public class BrandListController extends AbstractListController<BrandListComponent, Brand>{

    public BrandListController() {
        super(
            new BrandListComponent(),
            new BrandFormController(),
            new BrandRepository()
        );
    }

    @Override
    protected ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(Brand brand: this.registers){
            String[] row = {"" + brand.getId(), brand.getDescricao()};
            
            rows.add(row);
        }
        
        return rows;
    }
    
}
