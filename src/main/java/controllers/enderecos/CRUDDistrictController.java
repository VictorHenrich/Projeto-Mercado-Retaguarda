
package controllers.enderecos;

import controllers.builders.enderecos.DistrictBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.enderecos.District;
import repositories.enderecos.DistrictRepository;


public class CRUDDistrictController implements InterfaceCrudController<DistrictBuilder, District>{
    private final DistrictRepository repository;
    
    public CRUDDistrictController() {
        ArrayList<District> districts = new ArrayList();
        
        this.repository = new DistrictRepository(districts);
    }

    @Override
    public DistrictBuilder newModelBuilder() {
        return new DistrictBuilder();
    }

    @Override
    public void create(DistrictBuilder register) {
        
        try{
            District district = register.build(this.repository.nextID());
            
            this.repository.create(district);
            
            System.out.println("Bairro cadastrado com sucesso!");
            
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
        
        
    }

    @Override
    public void update(int id, DistrictBuilder register) {
        
        try{
            District district = register.build(id);
        
            this.repository.update(id, district);

            System.out.println("Bairro alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
        
    }

    @Override
    public void delete(int id) {
        
        try{
            this.repository.delete(id);
        
            System.out.println("Bairro excluído com sucesso!");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
        
    }

    @Override
    public AbstractList<District> fetch() {
        return this.repository.fetch();
    }

    @Override
    public District load(int id) {
        return this.load(id);
    }
    
    
    
}
