
package controllers.forms.addresses;

import controllers.builders.enderecos.DistrictBuilder;
import controllers.patterns.AbstractFormController;
import models.address.District;
import repositories.address.DistrictRepository;
import view.forms.DistrictFormComponent;

import javax.swing.*;


public class DistrictFormController extends AbstractFormController<DistrictFormComponent, District>{
    
    private final DistrictRepository repository = new DistrictRepository();
    
    public DistrictFormController() {
        super(new DistrictFormComponent());
    }
    
    private DistrictBuilder newDistrictBuilder(){
        try{
            return new DistrictBuilder()
                            .setDescricao(this.form.getjTextFieldDescription().getText());

        }catch(Exception error){
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    
    private void createDistrict(){
        DistrictBuilder districtBuilder = this.newDistrictBuilder();

        if(districtBuilder == null) return;

        District district = districtBuilder.build();

        try {
            this.repository.create(district);

            JOptionPane.showMessageDialog(this.form, "Bairro cadastrado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception error) {
            String messageError = "Falha ao cadastrar Bairro!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateDistrict(){
        DistrictBuilder districtBuilder = this.newDistrictBuilder();

        if(districtBuilder == null) return;


        try {
            int id = this.registerLoaded.getId();
            
            District district = (District) districtBuilder.setId(id).build();
            
            this.repository.update(id, district);
            
            System.out.println("Bairro alterado com sucesso!");
            
        } catch (Exception error) {
            String messageError = "Falha ao alterar Bairro!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    protected void resetStates() {
        this.form.getjTextFieldDescription().setText(null);
        
        this.form.getjTextFieldDescription().setEnabled(false);
    }
    
    @Override
    protected void onClickButtonNew() {
       this.form.getjTextFieldDescription().setEnabled(true);
    }
    
    @Override
    protected void onClickButtonWrite(){
        if(this.registerLoaded == null)
            this.createDistrict();
        
        else
            this.updateDistrict();
    }

    @Override
    protected void onClickButtonChange() {
        this.form.getjTextFieldDescription().setEnabled(true);
    }

    @Override
    protected void onShowComponent() {
        if(this.registerLoaded == null) return;
        
        this.form.getjTextFieldDescription().setText(this.registerLoaded.getDescricao());
    }

    
}
