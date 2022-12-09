
package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.components.AbstractFormComponent;


public class AddressFormComponent extends AbstractFormComponent {
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        this.jPanelHeader = new javax.swing.JPanel();
        this.jLabelTitle = new javax.swing.JLabel();
        this.jPanelFooter = new javax.swing.JPanel();
        this.jButtonNew = new javax.swing.JButton();
        this.jButtonChange = new javax.swing.JButton();
        this.jButtonWrite = new javax.swing.JButton();
        this.jButtonCancel = new javax.swing.JButton();
        this.jButtonOut = new javax.swing.JButton();
        this.jPanelBody = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelStreet = new javax.swing.JLabel();
        jTextFieldStreet = new javax.swing.JTextField();
        jTextFieldCep = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jLabelDistrict = new javax.swing.JLabel();
        jComboBoxDistrict = new javax.swing.JComboBox<>();
        jLabelCity = new javax.swing.JLabel();
        jComboBoxCity = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        this.jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("ENDEREÇO");
        this.jPanelHeader.add(this.jLabelTitle);

        this.jPanelFooter.setBackground(new java.awt.Color(153, 153, 153));
        this.jPanelFooter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jButtonNew.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonNew.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonNew.setText("Novo");
        this.jButtonNew.setToolTipText("Novo");
        this.jButtonNew.setBorder(null);
        this.jButtonNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonNew.setFocusPainted(false);
        this.jButtonNew.setFocusable(false);
        this.jButtonNew.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonNew);

        this.jButtonChange.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonChange.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonChange.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonChange.setText("Alterar");
        this.jButtonChange.setBorder(null);
        this.jButtonChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonChange.setEnabled(false);
        this.jButtonChange.setFocusPainted(false);
        this.jButtonChange.setFocusable(false);
        this.jButtonChange.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonChange);

        this.jButtonWrite.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonWrite.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonWrite.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonWrite.setText("Gravar");
        this.jButtonWrite.setBorder(null);
        this.jButtonWrite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonWrite.setEnabled(false);
        this.jButtonWrite.setFocusPainted(false);
        this.jButtonWrite.setFocusable(false);
        this.jButtonWrite.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonWrite);

        this.jButtonCancel.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonCancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonCancel.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonCancel.setText("Cancelar");
        this.jButtonCancel.setBorder(null);
        this.jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonCancel.setEnabled(false);
        this.jButtonCancel.setFocusPainted(false);
        this.jButtonCancel.setFocusable(false);
        this.jButtonCancel.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonCancel);

        this.jButtonOut.setBackground(new java.awt.Color(102, 102, 102));
        this.jButtonOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonOut.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonOut.setText("Sair");
        this.jButtonOut.setBorder(null);
        this.jButtonOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.jButtonOut.setFocusPainted(false);
        this.jButtonOut.setFocusable(false);
        this.jButtonOut.setPreferredSize(new java.awt.Dimension(120, 35));
        this.jPanelFooter.add(this.jButtonOut);

        this.jPanelBody.setBackground(new java.awt.Color(80, 80, 80));
        this.jPanelBody.setForeground(new java.awt.Color(80, 80, 80));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelStreet.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelStreet.setForeground(new java.awt.Color(190, 190, 190));
        jLabelStreet.setText("Logradouro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 6, 0, 0);
        jPanel1.add(jLabelStreet, gridBagConstraints);

        jTextFieldStreet.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldStreet.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldStreet.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldStreet.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldStreet.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldStreet.setEnabled(false);
        jTextFieldStreet.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 67, 0, 118);
        jPanel1.add(jTextFieldStreet, gridBagConstraints);

        jTextFieldCep.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldCep.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldCep.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldCep.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldCep.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldCep.setEnabled(false);
        jTextFieldCep.setPreferredSize(new java.awt.Dimension(300, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 67, 0, 118);
        jPanel1.add(jTextFieldCep, gridBagConstraints);

        jLabelCEP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCEP.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCEP.setText("CEP:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 6, 0, 0);
        jPanel1.add(jLabelCEP, gridBagConstraints);

        jLabelDistrict.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDistrict.setForeground(new java.awt.Color(190, 190, 190));
        jLabelDistrict.setText("Bairro:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 6, 0, 0);
        jPanel1.add(jLabelDistrict, gridBagConstraints);

        jComboBoxDistrict.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxDistrict.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBoxDistrict.setPreferredSize(new java.awt.Dimension(72, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 67, 0, 118);
        jPanel1.add(jComboBoxDistrict, gridBagConstraints);

        jLabelCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelCity.setForeground(new java.awt.Color(190, 190, 190));
        jLabelCity.setText("Cidade:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 6, 0, 0);
        jPanel1.add(jLabelCity, gridBagConstraints);

        jComboBoxCity.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxCity.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBoxCity.setPreferredSize(new java.awt.Dimension(72, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 228;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 67, 75, 118);
        jPanel1.add(jComboBoxCity, gridBagConstraints);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(this.jPanelBody);
        this.jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(this.jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public AddressFormComponent(){
        this.initComponents();
    }

    public JComboBox<String> getjComboBoxCity() {
        return jComboBoxCity;
    }

    public JComboBox<String> getjComboBoxDistrict() {
        return jComboBoxDistrict;
    }

    public JLabel getjLabelCEP() {
        return jLabelCEP;
    }

    public JLabel getjLabelCity() {
        return jLabelCity;
    }

    public JLabel getjLabelDistrict() {
        return jLabelDistrict;
    }

    public JLabel getjLabelStreet() {
        return jLabelStreet;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public JTextField getjTextFieldCep() {
        return jTextFieldCep;
    }

    public JTextField getjTextFieldStreet() {
        return jTextFieldStreet;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxDistrict;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelDistrict;
    private javax.swing.JLabel jLabelStreet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCep;
    private javax.swing.JTextField jTextFieldStreet;
    // End of variables declaration//GEN-END:variables
}
