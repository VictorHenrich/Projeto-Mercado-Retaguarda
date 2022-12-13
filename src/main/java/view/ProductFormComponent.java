
package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.components.AbstractFormComponent;

public class ProductFormComponent extends AbstractFormComponent {
    
    public ProductFormComponent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        this.jLabelTitle = new javax.swing.JLabel();
        this.jPanelFooter = new javax.swing.JPanel();
        this.jButtonNew = new javax.swing.JButton();
        this.jButtonChange = new javax.swing.JButton();
        this.jButtonWrite = new javax.swing.JButton();
        this.jButtonCancel = new javax.swing.JButton();
        this.jButtonOut = new javax.swing.JButton();
        this.jPanelBody = new javax.swing.JPanel();
        jLabelDescription = new javax.swing.JLabel();
        jTextFieldBuyingValue = new javax.swing.JTextField();
        jLabelBuyingValue = new javax.swing.JLabel();
        jTextFieldDescription = new javax.swing.JTextField();
        jTextFieldSaleValue = new javax.swing.JTextField();
        jLabelSaleValue = new javax.swing.JLabel();
        jLabelMinStock = new javax.swing.JLabel();
        jTextFieldUnBuying = new javax.swing.JTextField();
        jLabelMaxStock = new javax.swing.JLabel();
        jTextFieldMaxStock = new javax.swing.JTextField();
        jLabelBarcode = new javax.swing.JLabel();
        jTextFieldBarcode = new javax.swing.JTextField();
        jLabelUnBuying = new javax.swing.JLabel();
        jTextFieldMinStock = new javax.swing.JTextField();
        jLabelUnSales = new javax.swing.JLabel();
        jTextFieldUnSales = new javax.swing.JTextField();
        jLabelPurchaseValue = new javax.swing.JLabel();
        jComboBoxClass = new javax.swing.JComboBox<>();
        jLabelBrand = new javax.swing.JLabel();
        jComboBoxBrand = new javax.swing.JComboBox<>();
        jPanelContainerStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("Produto");
        jPanelHeader.add(this.jLabelTitle);

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

        jLabelDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(190, 190, 190));
        jLabelDescription.setText("Descrição:");

        jTextFieldBuyingValue.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldBuyingValue.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldBuyingValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldBuyingValue.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldBuyingValue.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldBuyingValue.setEnabled(false);
        jTextFieldBuyingValue.setOpaque(true);
        jTextFieldBuyingValue.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabelBuyingValue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelBuyingValue.setForeground(new java.awt.Color(190, 190, 190));
        jLabelBuyingValue.setText("Valor Compra:");

        jTextFieldDescription.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldDescription.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldDescription.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldDescription.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldDescription.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldDescription.setEnabled(false);
        jTextFieldDescription.setPreferredSize(new java.awt.Dimension(300, 30));

        jTextFieldSaleValue.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldSaleValue.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldSaleValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldSaleValue.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldSaleValue.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldSaleValue.setEnabled(false);
        jTextFieldSaleValue.setOpaque(true);
        jTextFieldSaleValue.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabelSaleValue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelSaleValue.setForeground(new java.awt.Color(190, 190, 190));
        jLabelSaleValue.setText("Valor Venda:");

        jLabelMinStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelMinStock.setForeground(new java.awt.Color(190, 190, 190));
        jLabelMinStock.setText("Estoque Min.:");

        jTextFieldUnBuying.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUnBuying.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUnBuying.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldUnBuying.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldUnBuying.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldUnBuying.setEnabled(false);
        jTextFieldUnBuying.setOpaque(true);
        jTextFieldUnBuying.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabelMaxStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelMaxStock.setForeground(new java.awt.Color(190, 190, 190));
        jLabelMaxStock.setText("Estoque Max.:");

        jTextFieldMaxStock.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldMaxStock.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldMaxStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldMaxStock.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldMaxStock.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldMaxStock.setEnabled(false);
        jTextFieldMaxStock.setOpaque(true);
        jTextFieldMaxStock.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabelBarcode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelBarcode.setForeground(new java.awt.Color(190, 190, 190));
        jLabelBarcode.setText("Código Barras:");

        jTextFieldBarcode.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldBarcode.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldBarcode.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldBarcode.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldBarcode.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldBarcode.setEnabled(false);
        jTextFieldBarcode.setPreferredSize(new java.awt.Dimension(300, 30));

        jLabelUnBuying.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUnBuying.setForeground(new java.awt.Color(190, 190, 190));
        jLabelUnBuying.setText("UN Compra:");

        jTextFieldMinStock.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldMinStock.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldMinStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldMinStock.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldMinStock.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldMinStock.setEnabled(false);
        jTextFieldMinStock.setOpaque(true);
        jTextFieldMinStock.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabelUnSales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUnSales.setForeground(new java.awt.Color(190, 190, 190));
        jLabelUnSales.setText("UN Venda:");

        jTextFieldUnSales.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldUnSales.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUnSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldUnSales.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldUnSales.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldUnSales.setEnabled(false);
        jTextFieldUnSales.setOpaque(true);
        jTextFieldUnSales.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabelPurchaseValue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPurchaseValue.setForeground(new java.awt.Color(190, 190, 190));
        jLabelPurchaseValue.setText("Classe:");

        jComboBoxClass.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxClass.setForeground(new java.awt.Color(204, 204, 204));
        jComboBoxClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxClass.setMinimumSize(new java.awt.Dimension(72, 30));
        jComboBoxClass.setOpaque(true);
        jComboBoxClass.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabelBrand.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelBrand.setForeground(new java.awt.Color(190, 190, 190));
        jLabelBrand.setText("Marca:");

        jComboBoxBrand.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxBrand.setForeground(new java.awt.Color(204, 204, 204));
        jComboBoxBrand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxBrand.setMinimumSize(new java.awt.Dimension(72, 30));
        jComboBoxBrand.setOpaque(true);
        jComboBoxBrand.setPreferredSize(new java.awt.Dimension(70, 30));

        jPanelContainerStatus.setBackground(new java.awt.Color(0, 0, 0));

        jLabelStatus.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabelStatus.setForeground(new java.awt.Color(0, 204, 153));
        jLabelStatus.setText("STATUS");
        jPanelContainerStatus.add(jLabelStatus);

        javax.swing.GroupLayout this.jPanelBodyLayout = new javax.swing.GroupLayout(this.jPanelBody);
        this.jPanelBody.setLayout(this.jPanelBodyLayout);
        this.jPanelBodyLayout.setHorizontalGroup(
            this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(this.jPanelBodyLayout.createSequentialGroup()
                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(this.jPanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, this.jPanelBodyLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(this.jPanelBodyLayout.createSequentialGroup()
                                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMinStock)
                                    .addComponent(jLabelBuyingValue)
                                    .addComponent(jLabelUnBuying)
                                    .addComponent(jLabelPurchaseValue))
                                .addGap(18, 18, 18)
                                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(this.jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldBuyingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabelSaleValue)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldSaleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, this.jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelMaxStock)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(this.jPanelBodyLayout.createSequentialGroup()
                                        .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldUnBuying, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUnSales, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelBrand, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldUnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(this.jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jLabelDescription)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(this.jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jLabelBarcode)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        this.jPanelBodyLayout.setVerticalGroup(
            this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, this.jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescription)
                    .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBarcode)
                    .addComponent(jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuyingValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuyingValue)
                    .addComponent(jTextFieldSaleValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaleValue))
                .addGap(18, 18, 18)
                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMinStock)
                    .addComponent(jLabelMaxStock)
                    .addComponent(jTextFieldMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUnBuying)
                    .addComponent(jTextFieldUnBuying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnSales)
                    .addComponent(jTextFieldUnSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(this.jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPurchaseValue)
                    .addComponent(jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBrand)
                    .addComponent(jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(this.jPanelFooter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
            .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public JComboBox<String> getjComboBoxBrand() {
        return jComboBoxBrand;
    }

    public JComboBox<String> getjComboBoxClass() {
        return jComboBoxClass;
    }

    public JLabel getjLabelBarcode() {
        return jLabelBarcode;
    }

    public JLabel getjLabelBrand() {
        return jLabelBrand;
    }

    public JLabel getjLabelBuyingValue() {
        return jLabelBuyingValue;
    }

    public JLabel getjLabelDescription() {
        return jLabelDescription;
    }

    public JLabel getjLabelMaxStock() {
        return jLabelMaxStock;
    }

    public JLabel getjLabelMinStock() {
        return jLabelMinStock;
    }

    public JLabel getjLabelPurchaseValue() {
        return jLabelPurchaseValue;
    }

    public JLabel getjLabelSaleValue() {
        return jLabelSaleValue;
    }

    public JLabel getjLabelStatus() {
        return jLabelStatus;
    }

    public JLabel getjLabelUnBuying() {
        return jLabelUnBuying;
    }

    public JLabel getjLabelUnSales() {
        return jLabelUnSales;
    }

    public JPanel getjPanelContainerStatus() {
        return jPanelContainerStatus;
    }

    public JTextField getjTextFieldBarcode() {
        return jTextFieldBarcode;
    }

    public JTextField getjTextFieldBuyingValue() {
        return jTextFieldBuyingValue;
    }

    public JTextField getjTextFieldDescription() {
        return jTextFieldDescription;
    }

    public JTextField getjTextFieldMaxStock() {
        return jTextFieldMaxStock;
    }

    public JTextField getjTextFieldMinStock() {
        return jTextFieldMinStock;
    }

    public JTextField getjTextFieldSaleValue() {
        return jTextFieldSaleValue;
    }

    public JTextField getjTextFieldUnBuying() {
        return jTextFieldUnBuying;
    }

    public JTextField getjTextFieldUnSales() {
        return jTextFieldUnSales;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxBrand;
    private javax.swing.JComboBox<String> jComboBoxClass;
    private javax.swing.JLabel jLabelBarcode;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelBuyingValue;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelMaxStock;
    private javax.swing.JLabel jLabelMinStock;
    private javax.swing.JLabel jLabelPurchaseValue;
    private javax.swing.JLabel jLabelSaleValue;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelUnBuying;
    private javax.swing.JLabel jLabelUnSales;
    private javax.swing.JPanel jPanelContainerStatus;
    private javax.swing.JTextField jTextFieldBarcode;
    private javax.swing.JTextField jTextFieldBuyingValue;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldMaxStock;
    private javax.swing.JTextField jTextFieldMinStock;
    private javax.swing.JTextField jTextFieldSaleValue;
    private javax.swing.JTextField jTextFieldUnBuying;
    private javax.swing.JTextField jTextFieldUnSales;
    // End of variables declaration//GEN-END:variables
}
