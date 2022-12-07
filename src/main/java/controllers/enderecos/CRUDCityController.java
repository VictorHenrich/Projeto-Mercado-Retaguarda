
package controllers.enderecos;

import controllers.builders.enderecos.CityBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.enderecos.City;
import repositories.enderecos.CityRepository;


public class CRUDCityController implements InterfaceCrudController<CityBuilder, City>{
    
    private final CityRepository repository;
    
    public CRUDCityController() {
        ArrayList<City> cities = new ArrayList();
        
        this.repository = new CityRepository(cities);
    }

    @Override
    public CityBuilder newModelBuilder() {
        return new CityBuilder();
    }

    @Override
    public void create(CityBuilder register) {
        try{
            City city = register.build(this.repository.nextID());
        
            this.repository.create(city);

            System.out.println("Cidade cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public void update(int id, CityBuilder register) {
       
        try{
            City city = register.build(id);
        
            this.repository.update(id, city);

            System.out.println("Cidade alterada com sucesso!");
            
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        
        try{
            this.repository.delete(id);
        
            System.out.println("Cidade excluída com sucesso!");
        }catch(Exception error){
            System.out.println(error.getMessage());
        }
        
    }

    @Override
    public AbstractList<City> fetch() {
        return this.repository.fetch();
    }

    @Override
    public City load(int id) {
        return this.repository.load(id);
    }
    
    
}
