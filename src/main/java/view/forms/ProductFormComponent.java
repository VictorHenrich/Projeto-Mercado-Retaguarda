
package view.forms;

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
        this.jTextFieldBuyingValue = new javax.swing.JTextField();
        this.jLabelBuyingValue = new javax.swing.JLabel();
        this.jTextFieldDescription = new javax.swing.JTextField();
        this.jTextFieldSaleValue = new javax.swing.JTextField();
        this.jLabelSaleValue = new javax.swing.JLabel();
        this.jLabelMinStock = new javax.swing.JLabel();
        this.jTextFieldUnBuying = new javax.swing.JTextField();
        this.jLabelMaxStock = new javax.swing.JLabel();
        this.jTextFieldMaxStock = new javax.swing.JTextField();
        this.jLabelBarcode = new javax.swing.JLabel();
        this.jTextFieldBarcode = new javax.swing.JTextField();
        this.jLabelUnBuying = new javax.swing.JLabel();
        this.jTextFieldMinStock = new javax.swing.JTextField();
        this.jLabelUnSales = new javax.swing.JLabel();
        this.jTextFieldUnSales = new javax.swing.JTextField();
        this.jLabelPurchaseValue = new javax.swing.JLabel();
        this.jComboBoxClass = new javax.swing.JComboBox<>();
        this.jLabelBrand = new javax.swing.JLabel();
        this.jComboBoxBrand = new javax.swing.JComboBox<>();
        this.jPanelContainerStatus = new javax.swing.JPanel();
        this.jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        this.jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("Produto");
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

        this.jTextFieldBuyingValue.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldBuyingValue.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldBuyingValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldBuyingValue.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldBuyingValue.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldBuyingValue.setEnabled(false);
        this.jTextFieldBuyingValue.setOpaque(true);
        this.jTextFieldBuyingValue.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jLabelBuyingValue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelBuyingValue.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelBuyingValue.setText("Valor Compra:");

        this.jTextFieldDescription.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldDescription.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldDescription.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldDescription.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldDescription.setEnabled(false);
        this.jTextFieldDescription.setPreferredSize(new java.awt.Dimension(300, 30));

        this.jTextFieldSaleValue.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldSaleValue.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldSaleValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldSaleValue.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldSaleValue.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldSaleValue.setEnabled(false);
        this.jTextFieldSaleValue.setOpaque(true);
        this.jTextFieldSaleValue.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jLabelSaleValue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelSaleValue.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelSaleValue.setText("Valor Venda:");

        this.jLabelMinStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelMinStock.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelMinStock.setText("Estoque Min.:");

        this.jTextFieldUnBuying.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldUnBuying.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldUnBuying.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldUnBuying.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldUnBuying.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldUnBuying.setEnabled(false);
        this.jTextFieldUnBuying.setOpaque(true);
        this.jTextFieldUnBuying.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jLabelMaxStock.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelMaxStock.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelMaxStock.setText("Estoque Max.:");

        this.jTextFieldMaxStock.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldMaxStock.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldMaxStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldMaxStock.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldMaxStock.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldMaxStock.setEnabled(false);
        this.jTextFieldMaxStock.setOpaque(true);
        this.jTextFieldMaxStock.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jLabelBarcode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelBarcode.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelBarcode.setText("Código Barras:");

        this.jTextFieldBarcode.setBackground(new java.awt.Color(50, 50, 50));
        this.jTextFieldBarcode.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldBarcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldBarcode.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldBarcode.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldBarcode.setEnabled(false);
        this.jTextFieldBarcode.setPreferredSize(new java.awt.Dimension(300, 30));

        this.jLabelUnBuying.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelUnBuying.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelUnBuying.setText("UN Compra:");

        this.jTextFieldMinStock.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldMinStock.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldMinStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldMinStock.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldMinStock.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldMinStock.setEnabled(false);
        this.jTextFieldMinStock.setOpaque(true);
        this.jTextFieldMinStock.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jLabelUnSales.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelUnSales.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelUnSales.setText("UN Venda:");

        this.jTextFieldUnSales.setBackground(new java.awt.Color(51, 51, 51));
        this.jTextFieldUnSales.setForeground(new java.awt.Color(204, 204, 204));
        this.jTextFieldUnSales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jTextFieldUnSales.setCaretColor(new java.awt.Color(255, 255, 255));
        this.jTextFieldUnSales.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        this.jTextFieldUnSales.setEnabled(false);
        this.jTextFieldUnSales.setOpaque(true);
        this.jTextFieldUnSales.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jLabelPurchaseValue.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelPurchaseValue.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelPurchaseValue.setText("Classe:");

        this.jComboBoxClass.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxClass.setForeground(new java.awt.Color(204, 204, 204));
        this.jComboBoxClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxClass.setMinimumSize(new java.awt.Dimension(72, 30));
        this.jComboBoxClass.setOpaque(true);
        this.jComboBoxClass.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jLabelBrand.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        this.jLabelBrand.setForeground(new java.awt.Color(190, 190, 190));
        this.jLabelBrand.setText("Marca:");

        this.jComboBoxBrand.setBackground(new java.awt.Color(51, 51, 51));
        this.jComboBoxBrand.setForeground(new java.awt.Color(204, 204, 204));
        this.jComboBoxBrand.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        this.jComboBoxBrand.setMinimumSize(new java.awt.Dimension(72, 30));
        this.jComboBoxBrand.setOpaque(true);
        this.jComboBoxBrand.setPreferredSize(new java.awt.Dimension(70, 30));

        this.jPanelContainerStatus.setBackground(new java.awt.Color(0, 0, 0));

        this.jLabelStatus.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelStatus.setForeground(new java.awt.Color(0, 204, 153));
        this.jLabelStatus.setText("STATUS");
        this.jPanelContainerStatus.add(this.jLabelStatus);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(this.jPanelBody);
        this.jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(this.jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(this.jLabelMinStock)
                                    .addComponent(this.jLabelBuyingValue)
                                    .addComponent(this.jLabelUnBuying)
                                    .addComponent(this.jLabelPurchaseValue))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(this.jTextFieldBuyingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(this.jLabelSaleValue)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.jTextFieldSaleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(this.jTextFieldMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(this.jLabelMaxStock)
                                        .addGap(18, 18, 18)
                                        .addComponent(this.jTextFieldMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(this.jComboBoxClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(this.jTextFieldUnBuying, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(this.jLabelUnSales, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(this.jLabelBrand, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(this.jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(this.jTextFieldUnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(this.jLabelDescription)
                                .addGap(18, 18, 18)
                                .addComponent(this.jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(this.jLabelBarcode)
                                .addGap(18, 18, 18)
                                .addComponent(this.jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(this.jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelDescription)
                    .addComponent(this.jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelBarcode)
                    .addComponent(this.jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jTextFieldBuyingValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelBuyingValue)
                    .addComponent(this.jTextFieldSaleValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelSaleValue))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelMinStock)
                    .addComponent(this.jLabelMaxStock)
                    .addComponent(this.jTextFieldMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jTextFieldMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelUnBuying)
                    .addComponent(this.jTextFieldUnBuying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelUnSales)
                    .addComponent(this.jTextFieldUnSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(this.jLabelPurchaseValue)
                    .addComponent(this.jComboBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.jLabelBrand)
                    .addComponent(this.jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
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
    
    public JComboBox<String> getjComboBoxBrand() {
        return this.jComboBoxBrand;
    }

    public JComboBox<String> getjComboBoxClass() {
        return this.jComboBoxClass;
    }

    public JLabel getjLabelBarcode() {
        return this.jLabelBarcode;
    }

    public JLabel getjLabelBrand() {
        return this.jLabelBrand;
    }

    public JLabel getjLabelBuyingValue() {
        return this.jLabelBuyingValue;
    }

    public JLabel getjLabelDescription() {
        return this.jLabelDescription;
    }

    public JLabel getjLabelMaxStock() {
        return this.jLabelMaxStock;
    }

    public JLabel getjLabelMinStock() {
        return this.jLabelMinStock;
    }

    public JLabel getjLabelPurchaseValue() {
        return jLabelPurchaseValue;
    }

    public JLabel getjLabelSaleValue() {
        return this.jLabelSaleValue;
    }

    public JLabel getjLabelStatus() {
        return this.jLabelStatus;
    }

    public JLabel getjLabelUnBuying() {
        return this.jLabelUnBuying;
    }

    public JLabel getjLabelUnSales() {
        return this.jLabelUnSales;
    }

    public JPanel getjPanelContainerStatus() {
        return this.jPanelContainerStatus;
    }

    public JTextField getjTextFieldBarcode() {
        return this.jTextFieldBarcode;
    }

    public JTextField getjTextFieldBuyingValue() {
        return this.jTextFieldBuyingValue;
    }

    public JTextField getjTextFieldDescription() {
        return this.jTextFieldDescription;
    }

    public JTextField getjTextFieldMaxStock() {
        return this.jTextFieldMaxStock;
    }

    public JTextField getjTextFieldMinStock() {
        return this.jTextFieldMinStock;
    }

    public JTextField getjTextFieldSaleValue() {
        return this.jTextFieldSaleValue;
    }

    public JTextField getjTextFieldUnBuying() {
        return this.jTextFieldUnBuying;
    }

    public JTextField getjTextFieldUnSales() {
        return this.jTextFieldUnSales;
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
