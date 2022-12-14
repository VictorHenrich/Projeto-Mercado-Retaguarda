
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

        jTextFieldDescription2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanelHeader = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelFooter = new javax.swing.JPanel();
        jButtonNew = new javax.swing.JButton();
        jButtonChange = new javax.swing.JButton();
        jButtonWrite = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonOut = new javax.swing.JButton();
        jPanelBody = new javax.swing.JPanel();
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
        jLabelPurchaseValue5 = new javax.swing.JLabel();
        jComboBoxClass = new javax.swing.JComboBox<>();
        jLabelBrand = new javax.swing.JLabel();
        jComboBoxBrand = new javax.swing.JComboBox<>();
        jPanelContainerStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();

        jTextFieldDescription2.setBackground(new java.awt.Color(50, 50, 50));
        jTextFieldDescription2.setForeground(new java.awt.Color(190, 190, 190));
        jTextFieldDescription2.setBorder(new javax.swing.border.MatteBorder(null));
        jTextFieldDescription2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldDescription2.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jTextFieldDescription2.setEnabled(false);
        jTextFieldDescription2.setPreferredSize(new java.awt.Dimension(300, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTitle.setBackground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTitle.setText("Produto");
        jPanelHeader.add(jLabelTitle);

        jPanelFooter.setBackground(new java.awt.Color(153, 153, 153));
        jPanelFooter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonNew.setBackground(new java.awt.Color(102, 102, 102));
        jButtonNew.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonNew.setForeground(new java.awt.Color(204, 204, 204));
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
        jPanelBody.setForeground(new java.awt.Color(80, 80, 80));

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
        jTextFieldDescription.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
        jTextFieldBarcode.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldBarcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        jLabelPurchaseValue5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPurchaseValue5.setForeground(new java.awt.Color(190, 190, 190));
        jLabelPurchaseValue5.setText("Classe:");

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

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(jPanelBody);
        jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyLayout.createSequentialGroup()
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelMinStock)
                                    .addComponent(jLabelBuyingValue)
                                    .addComponent(jLabelUnBuying)
                                    .addComponent(jLabelPurchaseValue5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldBuyingValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabelSaleValue)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldSaleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                                        .addComponent(jTextFieldMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelMaxStock)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelBodyLayout.createSequentialGroup()
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jComboBoxClass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldUnBuying, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelUnSales, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabelBrand, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldUnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jLabelDescription)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelBodyLayout.createSequentialGroup()
                                .addComponent(jLabelBarcode)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContainerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescription)
                    .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBarcode)
                    .addComponent(jTextFieldBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuyingValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuyingValue)
                    .addComponent(jTextFieldSaleValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaleValue))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMinStock)
                    .addComponent(jLabelMaxStock)
                    .addComponent(jTextFieldMaxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMinStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUnBuying)
                    .addComponent(jTextFieldUnBuying, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnSales)
                    .addComponent(jTextFieldUnSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPurchaseValue5)
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
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonOut;
    private javax.swing.JButton jButtonWrite;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxBrand;
    private javax.swing.JComboBox<String> jComboBoxClass;
    private javax.swing.JLabel jLabelBarcode;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelBuyingValue;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelMaxStock;
    private javax.swing.JLabel jLabelMinStock;
    private javax.swing.JLabel jLabelPurchaseValue5;
    private javax.swing.JLabel jLabelSaleValue;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUnBuying;
    private javax.swing.JLabel jLabelUnSales;
    private javax.swing.JPanel jPanelBody;
    private javax.swing.JPanel jPanelContainerStatus;
    private javax.swing.JPanel jPanelFooter;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JTextField jTextFieldBarcode;
    private javax.swing.JTextField jTextFieldBuyingValue;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldDescription2;
    private javax.swing.JTextField jTextFieldMaxStock;
    private javax.swing.JTextField jTextFieldMinStock;
    private javax.swing.JTextField jTextFieldSaleValue;
    private javax.swing.JTextField jTextFieldUnBuying;
    private javax.swing.JTextField jTextFieldUnSales;
    // End of variables declaration//GEN-END:variables
}
