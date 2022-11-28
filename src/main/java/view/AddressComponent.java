
package view;

import java.util.ArrayList;
import javax.swing.JComponent;
import models.enderecos.Bairro;
import models.enderecos.Cidade;
import models.enderecos.Endereco;
import controllers.enderecos.EnderecosCrudController;
import repositories.enderecos.EnderecoRepository;
import view.utils.UtilsComponents;


public class AddressComponent extends javax.swing.JFrame {
    
    private Endereco newAddress(){
        
        int id = this.controller.nextID();
        
        String street = jTextFieldStreet.getText();
        String cep = jTextFieldCep.getText();
        Bairro district = this.districts.get(this.jComboBoxDistrict.getSelectedIndex());
        Cidade city = this.cities.get(this.jComboBoxCity.getSelectedIndex());
        
        return new Endereco(
            street, 
            cep, 
            city, 
            district,
            id
        );
    }
    
    private void addAddress(){
        Endereco address = this.newAddress();
        
        this.controller.create(address);
        
        System.out.println("ENDEREÇO CADASTRADO COM SUCESSO!");
    }
    
    private void changeAddress(){
        if(this.addressLoaded == null)
            return;
                    
        Endereco address = this.newAddress();
        
        controller.update(this.addressLoaded.getId(), address);
        
        System.out.println("ENDEREÇO ALTERADO COM SUCESSO!");
    }
    
    private void loadFields(){
        for(Cidade city: this.cities){
            this.jComboBoxCity.addItem(city.getDescricao());
        }
        
        for(Bairro district: this.districts){
            this.jComboBoxDistrict.addItem(district.getDescricao());
        }
    }
    
    private void activateButtons(boolean state){
        ArrayList<JComponent> buttons = new ArrayList();
        
        buttons.add(jButtonCancel);
        buttons.add(jButtonWrite);
        
        UtilsComponents.disabledComponents(buttons, state);
    }
    
    private void activateFields(boolean state){
        ArrayList<JComponent> fields = new ArrayList();
        
        fields.add(jTextFieldCep);
        fields.add(jTextFieldStreet);
        fields.add(jComboBoxCity);
        fields.add(jComboBoxDistrict);
        
        UtilsComponents.disabledComponents(fields, state);
    }
    
    private void clearStates(){
        this.activateButtons(false);
        this.activateFields(false);
        this.jTextFieldCep.setText(null);
        this.jTextFieldStreet.setText(null);
        this.jComboBoxCity.setSelectedItem(null);
        this.jComboBoxDistrict.setSelectedItem(null);
    }
    
    
    public AddressComponent() {
        
        ArrayList<Endereco> address = new ArrayList();
        
        EnderecoRepository repository = new EnderecoRepository(address);
        
        this.controller = new EnderecosCrudController(repository);
        
        this.cities = new ArrayList();
        this.districts = new ArrayList();
        
        this.cities.add(new Cidade("Cidade 1", 1));
        this.cities.add(new Cidade("Cidade 2", 2));
        
        this.districts.add(new Bairro("Bairro 1", 1));
        this.districts.add(new Bairro("Bairro 2", 2));
        
        initComponents();
        loadFields();
    }
    
    public AddressComponent(
       EnderecosCrudController controller,
       ArrayList<Cidade> cities,
       ArrayList<Bairro> districts,
       Endereco addressLoaded
    ){
        this.controller = controller;
        this.cities = cities;
        this.districts = districts;
        this.addressLoaded = addressLoaded;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonChange = new javax.swing.JButton();
        jButtonWrite = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonOut = new javax.swing.JButton();
        jPanelBody = new javax.swing.JPanel();
        jLabelStreet = new javax.swing.JLabel();
        jTextFieldStreet = new javax.swing.JTextField();
        jLabelCep = new javax.swing.JLabel();
        jTextFieldCep = new javax.swing.JTextField();
        jLabelDistrict = new javax.swing.JLabel();
        jComboBoxDistrict = new javax.swing.JComboBox<>();
        jLabelCity = new javax.swing.JLabel();
        jComboBoxCity = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setText("ENDEREÇO");
        jPanelHeader.add(jLabelTitle);

        jPanelFooter.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFooter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonNew.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNew.setForeground(new java.awt.Color(204, 204, 204));
        jButtonNew.setIcon(new javax.swing.ImageIcon("C:\\Users\\Victor Henrich\\Downloads\\add.png")); // NOI18N
        jButtonNew.setText("Novo");
        jButtonNew.setToolTipText("Novo");
        jButtonNew.setBorder(null);
        jButtonNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNew.setFocusPainted(false);
        jButtonNew.setFocusable(false);
        jButtonNew.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonNew);

        jButtonChange.setBackground(new java.awt.Color(102, 102, 102));
        jButtonChange.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonChange.setForeground(new java.awt.Color(204, 204, 204));
        jButtonChange.setIcon(new javax.swing.ImageIcon("C:\\Users\\Victor Henrich\\Downloads\\edit.png")); // NOI18N
        jButtonChange.setText("Alterar");
        jButtonChange.setBorder(null);
        jButtonChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChange.setEnabled(false);
        jButtonChange.setFocusPainted(false);
        jButtonChange.setFocusable(false);
        jButtonChange.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonChange);

        jButtonWrite.setBackground(new java.awt.Color(102, 102, 102));
        jButtonWrite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonWrite.setForeground(new java.awt.Color(204, 204, 204));
        jButtonWrite.setIcon(new javax.swing.ImageIcon("C:\\Users\\Victor Henrich\\Downloads\\save.png")); // NOI18N
        jButtonWrite.setText("Gravar");
        jButtonWrite.setBorder(null);
        jButtonWrite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonWrite.setEnabled(false);
        jButtonWrite.setFocusPainted(false);
        jButtonWrite.setFocusable(false);
        jButtonWrite.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWriteActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonWrite);

        jButtonCancel.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(204, 204, 204));
        jButtonCancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Victor Henrich\\Downloads\\cancel.png")); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.setBorder(null);
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.setEnabled(false);
        jButtonCancel.setFocusPainted(false);
        jButtonCancel.setFocusable(false);
        jButtonCancel.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonCancel);

        jButtonOut.setBackground(new java.awt.Color(102, 102, 102));
        jButtonOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonOut.setForeground(new java.awt.Color(204, 204, 204));
        jButtonOut.setIcon(new javax.swing.ImageIcon("C:\\Users\\Victor Henrich\\Downloads\\logout.png")); // NOI18N
        jButtonOut.setText("Sair");
        jButtonOut.setBorder(null);
        jButtonOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOut.setFocusPainted(false);
        jButtonOut.setFocusable(false);
        jButtonOut.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOutActionPerformed(evt);
            }
        });
        jPanelFooter.add(jButtonOut);

        jPanelBody.setBackground(new java.awt.Color(80, 80, 80));
        jPanelBody.setForeground(new java.awt.Color(153, 153, 153));

        jLabelStreet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelStreet.setForeground(new java.awt.Color(190, 190, 190));
        jLabelStreet.setText("Logradouro:");

        jTextFieldStreet.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldStreet.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldStreet.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldStreet.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldStreet.setEnabled(false);
        jTextFieldStreet.setPreferredSize(new java.awt.Dimension(200, 25));

        jLabelCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCep.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCep.setText("CEP:");

        jTextFieldCep.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldCep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldCep.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCep.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCep.setEnabled(false);
        jTextFieldCep.setPreferredSize(new java.awt.Dimension(200, 25));

        jLabelDistrict.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDistrict.setForeground(new java.awt.Color(190, 190, 190));
        jLabelDistrict.setText("Bairro:");

        jComboBoxDistrict.setBackground(new java.awt.Color(50, 50, 50));
        jComboBoxDistrict.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxDistrict.setForeground(new java.awt.Color(190, 190, 190));
        jComboBoxDistrict.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBoxDistrict.setEnabled(false);
        jComboBoxDistrict.setPreferredSize(new java.awt.Dimension(200, 25));
        jComboBoxDistrict.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxDistrictItemStateChanged(evt);
            }
        });

        jLabelCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCity.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCity.setText("Cidade:");

        jComboBoxCity.setBackground(new java.awt.Color(50, 50, 50));
        jComboBoxCity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxCity.setForeground(new java.awt.Color(190, 190, 190));
        jComboBoxCity.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBoxCity.setEnabled(false);
        jComboBoxCity.setPreferredSize(new java.awt.Dimension(200, 25));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelStreet)
                    .addComponent(jLabelCep)
                    .addComponent(jLabelDistrict)
                    .addComponent(jLabelCity))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldStreet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDistrict, 0, 300, Short.MAX_VALUE)
                    .addComponent(jComboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStreet)
                    .addComponent(jTextFieldStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCep)
                    .addComponent(jTextFieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDistrict)
                    .addComponent(jComboBoxDistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCity)
                    .addComponent(jComboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
            .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        this.activateButtons(true);
        this.activateFields(true);
    }//GEN-LAST:event_jButtonNewActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.clearStates();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOutActionPerformed
        this.clearStates();
        this.dispose();
    }//GEN-LAST:event_jButtonOutActionPerformed

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
        this.activateButtons(true);
        this.activateFields(true);
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jButtonWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWriteActionPerformed
        if(this.addressLoaded == null)
            this.addAddress();
        
        else
            this.changeAddress();
        
        this.clearStates();
    }//GEN-LAST:event_jButtonWriteActionPerformed

    private void jComboBoxDistrictItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxDistrictItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDistrictItemStateChanged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressComponent().setVisible(true);
            }
        });
    }
    
    private ArrayList<Cidade> cities;
    private ArrayList<Bairro> districts;
    private Endereco addressLoaded;
    private EnderecosCrudController controller;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonWrite;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxDistrict;
    private javax.swing.JLabel jLabelCep;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelDistrict;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldStreet;
    // End of variables declaration//GEN-END:variables
}
