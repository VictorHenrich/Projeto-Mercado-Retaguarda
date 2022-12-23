
package view.forms;

import javax.swing.JLabel;
import javax.swing.JTextField;
import view.components.AbstractFormComponent;

public class CityFormComponent extends AbstractFormComponent {
    public CityFormComponent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jPanelHeader = new javax.swing.JPanel();
        this.jLabelTitle = new javax.swing.JLabel();
        this.jPanelFooter = new javax.swing.JPanel();
        this.jButtonNew = new javax.swing.JButton();
        this.jButtonChange = new javax.swing.JButton();
        this.jButtonWrite = new javax.swing.JButton();
        this.jButtonCancel = new javax.swing.JButton();
        this.jButtonOut = new javax.swing.JButton();
        this.jPanelBody = new javax.swing.JPanel();
        this.jLabelDescription = new javax.swing.JLabel();
        this.jTextFieldDescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        this.jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("Cidade");
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

        this.jLabelDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelDescription.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelDescription.setText("Descrição:");

        this.jTextFieldDescription.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldDescription.setForeground(new java.awt.Color(190, 190, 190));
        this.jTextFieldDescription.setBorder(new javax.swing.border.MatteBorder(null));
        this.jTextFieldDescription.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldDescription.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldDescription.setEnabled(false);
        this.jTextFieldDescription.setPreferredSize(new java.awt.Dimension(300, 30));

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(this.jPanelBody);
        this.jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(this.jLabelDescription)
                .addGap(18, 18, 18)
                .addComponent(this.jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelDescription)
                    .addComponent(this.jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(this.jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
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

    public JLabel getjLabelDescription() {
        return this.jLabelDescription;
    }

    public JTextField getjTextFieldDescription() {
        return this.jTextFieldDescription;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JTextField jTextFieldDescription;
    // End of variables declaration//GEN-END:variables
}
