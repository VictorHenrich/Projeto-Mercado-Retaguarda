
package controllers.patterns;

import models.address.Address;
import models.address.City;
import models.address.District;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import models.people.Person;
import repositories.address.AddressRepository;
import repositories.address.CityRepository;
import repositories.address.DistrictRepository;
import view.components.AbstractFormPersonComponent;

import javax.swing.*;


public abstract class AbstractFormPersonController<T extends AbstractFormPersonComponent, M extends Person> extends AbstractFormController<T, M> {

    protected ArrayList<City> cities;
    protected ArrayList<District> districts;
    protected Address addressLoaded;

    public AbstractFormPersonController(T form) {
        super(form);

        init();
    }

    private void init() {

        this.form.getjTextFieldStreet().setEnabled(false);

        this.form.getjComboBoxCity().setEnabled(false);

        this.form.getjComboBoxDistrict().setEnabled(false);

        try {
            this.cities = (ArrayList<City>) new CityRepository().fetch();

            this.districts = (ArrayList<District>) new DistrictRepository().fetch();

            for (District d : this.districts)
                this.form.getjComboBoxDistrict().addItem(d.getDescricao());

            for (City c : this.cities)
                this.form.getjComboBoxCity().addItem(c.getDescricao());


            this.addActions();

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }

    protected void enabledFields(boolean status) {
        this.form.getjTextAreaObs().setEnabled(status);
        this.form.getjTextFieldEmail().setEnabled(status);
        this.form.getjTextFieldPhone1().setEnabled(status);
        this.form.getjTextFieldPhone2().setEnabled(status);
        this.form.getjTextFieldName().setEnabled(status);
        this.form.getjTextFieldCep().setEnabled(status);
    }

    protected void clearFields() {
        this.form.getjTextAreaObs().setText("");
        this.form.getjTextFieldEmail().setText("");
        this.form.getjTextFieldPhone1().setText("");
        this.form.getjTextFieldPhone2().setText("");
        this.form.getjTextFieldName().setText("");
        this.form.getjTextFieldStreet().setText("");
        this.form.getjComboBoxCity().setSelectedIndex(-1);
        this.form.getjComboBoxDistrict().setSelectedIndex(-1);
        this.form.getjTextFieldCep().setText("");
    }

    protected void loadFields() {
        if (this.registerLoaded == null) return;

        if (this.registerLoaded.getEndereco() != null) {

            this.addressLoaded = this.registerLoaded.getEndereco();

            this.form.getjTextFieldCep().setText(this.registerLoaded.getEndereco().getCep());

            if (!this.districts.isEmpty() && this.registerLoaded.getEndereco().getBairro() != null) {
                for (int districtIndex = 0; districtIndex < this.districts.size(); districtIndex++) {

                    District district = this.districts.get(districtIndex);

                    if (district.getId() == this.registerLoaded.getEndereco().getBairro().getId())
                        this.form.getjComboBoxDistrict().setSelectedIndex(districtIndex);
                }
            }

            if (!this.cities.isEmpty() && this.registerLoaded.getEndereco().getCidade() != null) {
                for (int cityIndex = 0; cityIndex < this.cities.size(); cityIndex++) {
                    City city = this.cities.get(cityIndex);

                    if (city.getId() == this.registerLoaded.getEndereco().getCidade().getId())
                        this.form.getjComboBoxCity().setSelectedIndex(cityIndex);
                }
            }
        }

        this.form.getjTextAreaObs().setText(this.registerLoaded.getObservacao());
        this.form.getjTextFieldEmail().setText(this.registerLoaded.getEmail());
        this.form.getjTextFieldPhone1().setText(this.registerLoaded.getFone1());
        this.form.getjTextFieldPhone2().setText(this.registerLoaded.getFone2());
        this.form.getjTextFieldName().setText(this.registerLoaded.getNome());
        this.form.getjTextFieldStreet().setText(this.registerLoaded.getComplementoEndereco());

        String status = this.registerLoaded.getStatus() == 'A' ? "ATIVO" : "INATIVO";

        this.form.getjLabelStatus().setText(status);
    }

    private void loadAddress() {
        try {
            this.addressLoaded = null;

            String cep = this.form.getjTextFieldCep().getText();

            ArrayList<Address> addresses = (ArrayList<Address>) new AddressRepository().fetch();
            Address address = null;


            for (Address a : addresses)
                if (a.getCep().toUpperCase().equals(cep))
                    address = a;

            if (address == null) {
                JOptionPane.showMessageDialog(this.form, "CEP não localizado", "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
                return;

            } else {
                this.addressLoaded = address;
            }

            for (int cityIndex = 0; cityIndex < this.cities.size(); cityIndex++) {
                City city = this.cities.get(cityIndex);

                if (city.getId() == this.addressLoaded.getCidade().getId())
                    this.form.getjComboBoxCity().setSelectedIndex(cityIndex);
            }

            for (int districtIndex = 0; districtIndex < this.districts.size(); districtIndex++) {
                District district = this.districts.get(districtIndex);

                if (district.getId() == this.addressLoaded.getBairro().getId())
                    this.form.getjComboBoxDistrict().setSelectedIndex(districtIndex);
            }

            if (this.addressLoaded.getLogradouro().equals("") || this.addressLoaded.getLogradouro() == null)
                return;

            this.form.getjTextFieldStreet().setText(this.addressLoaded.getLogradouro());

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this.form, "Falha ao carregar dados de endereço!", "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addActions() {

        this.form.getjTextFieldCep().addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (
                        e.getKeyCode() != 10 ||
                                form.getjTextFieldCep().getText().equals("") ||
                                form.getjTextFieldCep().getText() == null
                ) return;

                loadAddress();
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }


}
