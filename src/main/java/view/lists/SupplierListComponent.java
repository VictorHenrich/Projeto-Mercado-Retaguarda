
package view.lists;

import view.components.AbstractListComponent;

public class SupplierListComponent extends AbstractListComponent {

 
    public SupplierListComponent() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.jPanelHeader = new javax.swing.JPanel();
        this.jLabelTitle = new javax.swing.JLabel();
        this.jPanelFooter = new javax.swing.JPanel();
        this.jButtonSearch = new javax.swing.JButton();
        this.jButtonCreate = new javax.swing.JButton();
        this.jButtonUpdate = new javax.swing.JButton();
        this.jButtonDelete = new javax.swing.JButton();
        this.jButtonOut = new javax.swing.JButton();
        this.jPanelBody = new javax.swing.JPanel();
        this.jScrollPaneTable = new javax.swing.JScrollPane();
        this.jTableList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        this.jPanelHeader.setBackground(new java.awt.Color(0, 204, 153));
        this.jPanelHeader.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jLabelTitle.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        this.jLabelTitle.setForeground(new java.awt.Color(51, 51, 51));
        this.jLabelTitle.setText("Fornecedor");
        this.jPanelHeader.add(this.jLabelTitle);

        this.jPanelFooter.setBackground(new java.awt.Color(153, 153, 153));
        this.jPanelFooter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        this.jButtonSearch.setBackground(new java.awt.Color(51, 51, 51));
        this.jButtonSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonSearch.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonSearch.setText("Buscar");
        this.jButtonSearch.setPreferredSize(new java.awt.Dimension(100, 30));
        this.jPanelFooter.add(this.jButtonSearch);

        this.jButtonCreate.setBackground(new java.awt.Color(51, 51, 51));
        this.jButtonCreate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonCreate.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonCreate.setText("Cadastrar");
        this.jButtonCreate.setPreferredSize(new java.awt.Dimension(100, 30));
        this.jPanelFooter.add(this.jButtonCreate);

        this.jButtonUpdate.setBackground(new java.awt.Color(51, 51, 51));
        this.jButtonUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonUpdate.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonUpdate.setText("Alterar");
        this.jButtonUpdate.setPreferredSize(new java.awt.Dimension(100, 30));
        this.jPanelFooter.add(this.jButtonUpdate);

        this.jButtonDelete.setBackground(new java.awt.Color(51, 51, 51));
        this.jButtonDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonDelete.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonDelete.setText("Excluir");
        this.jButtonDelete.setPreferredSize(new java.awt.Dimension(100, 30));
        this.jPanelFooter.add(this.jButtonDelete);

        this.jButtonOut.setBackground(new java.awt.Color(51, 51, 51));
        this.jButtonOut.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        this.jButtonOut.setForeground(new java.awt.Color(204, 204, 204));
        this.jButtonOut.setText("Sair");
        this.jButtonOut.setPreferredSize(new java.awt.Dimension(100, 30));
        this.jPanelFooter.add(this.jButtonOut);

        this.jPanelBody.setBackground(new java.awt.Color(0, 0, 0));

        this.jTableList.setBackground(new java.awt.Color(51, 51, 51));
        this.jTableList.setForeground(new java.awt.Color(204, 204, 204));
        this.jTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Razão Social", "CNPJ / CPF", "RG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        this.jScrollPaneTable.setViewportView(this.jTableList);

        javax.swing.GroupLayout jPanelBodyLayout = new javax.swing.GroupLayout(this.jPanelBody);
        this.jPanelBody.setLayout(jPanelBodyLayout);
        jPanelBodyLayout.setHorizontalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(this.jScrollPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelBodyLayout.setVerticalGroup(
            jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
            .addGroup(jPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(this.jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(this.jPanelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
            .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(this.jPanelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
