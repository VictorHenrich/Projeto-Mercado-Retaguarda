
package view;

import controllers.enderecos.CRUDAddressController;
import controllers.enderecos.CRUDCityController;
import controllers.enderecos.CRUDDistrictController;
import controllers.pessoas.CRUDClientController;
import controllers.pessoas.CRUDSupplierController;
import java.util.ArrayList;
import repositories.pessoas.SupplierRepository;
import models.pessoas.Supplier;
import models.pessoas.Client;
import models.enderecos.District;
import models.enderecos.Address;
import models.enderecos.City;
import repositories.enderecos.AddressRepository;
import repositories.enderecos.CityRepository;
import repositories.enderecos.DistrictRepository;
import repositories.pessoas.ClientRepository;


public class MainComponent extends javax.swing.JFrame {


    public MainComponent() {
        ArrayList<Supplier> suppliers = new ArrayList();
        ArrayList<Client> clients = new ArrayList();
        ArrayList<District> districts = new ArrayList();
        ArrayList<Address> address = new ArrayList();
        ArrayList<City> cities = new ArrayList();
        
        SupplierRepository supplierRepository = new SupplierRepository(suppliers);
        ClientRepository clientRepository = new ClientRepository(clients);
        DistrictRepository districtRepository = new DistrictRepository(districts);
        AddressRepository addressRepository = new AddressRepository(address);
        CityRepository cityRepository = new CityRepository(cities);
        
        this.crudSuppliercontroller = new CRUDSupplierController(supplierRepository);
        this.crudClientController = new CRUDClientController(clientRepository);
        this.crudDistrictController = new CRUDDistrictController(districtRepository);
        this.crudAddressController = new CRUDAddressController(addressRepository);
        this.crudCityController = new CRUDCityController(cityRepository);
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItemCollaborator = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemSupplier = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemClient = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jCheckBoxMenuItemCity = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemAddress = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemDistrict = new javax.swing.JCheckBoxMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jCheckBoxMenuItemClasse = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemMarca = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItemProduto = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setText("Cadastros");

        jMenu5.setText("Pessoas");

        jCheckBoxMenuItemCollaborator.setText("Colaborador");
        jCheckBoxMenuItemCollaborator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemCollaboratorActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItemCollaborator);

        jCheckBoxMenuItemSupplier.setText("Fornecedor");
        jCheckBoxMenuItemSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemSupplierActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItemSupplier);

        jCheckBoxMenuItemClient.setText("Cliente");
        jCheckBoxMenuItemClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemClientActionPerformed(evt);
            }
        });
        jMenu5.add(jCheckBoxMenuItemClient);

        jMenu1.add(jMenu5);

        jMenu6.setText("Endereços");

        jCheckBoxMenuItemCity.setText("Cidade");
        jCheckBoxMenuItemCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemCityActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItemCity);

        jCheckBoxMenuItemAddress.setText("Endereço");
        jCheckBoxMenuItemAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemAddressActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItemAddress);

        jCheckBoxMenuItemDistrict.setText("Bairro");
        jCheckBoxMenuItemDistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemDistrictActionPerformed(evt);
            }
        });
        jMenu6.add(jCheckBoxMenuItemDistrict);

        jMenu1.add(jMenu6);

        jMenu7.setText("Produtos");

        jCheckBoxMenuItemClasse.setText("Classe");
        jMenu7.add(jCheckBoxMenuItemClasse);

        jCheckBoxMenuItemMarca.setText("Marca");
        jMenu7.add(jCheckBoxMenuItemMarca);

        jCheckBoxMenuItemProduto.setText("Produto");
        jMenu7.add(jCheckBoxMenuItemProduto);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Financeiro");

        jMenu3.setText("Vendas");
        jMenu2.add(jMenu3);

        jMenu4.setText("Compras");
        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItemCollaboratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemCollaboratorActionPerformed
        CollaboratorComponent collaboradorComponent = new CollaboratorComponent();
        
        collaboradorComponent.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItemCollaboratorActionPerformed

    private void jCheckBoxMenuItemSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemSupplierActionPerformed
       SupplierComponent supplierComponent = new SupplierComponent(this.crudSuppliercontroller, null);
       
       supplierComponent.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItemSupplierActionPerformed

    private void jCheckBoxMenuItemClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemClientActionPerformed
        ClientComponent clientComponent = new ClientComponent(this.crudClientController, null);
        
        clientComponent.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItemClientActionPerformed

    private void jCheckBoxMenuItemCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemCityActionPerformed
        CityComponent cityComponent = new CityComponent(this.crudCityController, null);
        
        cityComponent.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItemCityActionPerformed

    private void jCheckBoxMenuItemAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemAddressActionPerformed
        AddressComponent addressComponent = new AddressComponent(this.crudAddressController, new ArrayList(), new ArrayList(), null);
        
        addressComponent.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItemAddressActionPerformed

    private void jCheckBoxMenuItemDistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemDistrictActionPerformed
        DistrictComponent districtComponent = new DistrictComponent(this.crudDistrictController, null);
        
        districtComponent.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItemDistrictActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainComponent().setVisible(true);
            }
        });
    }
    
    private final CRUDSupplierController crudSuppliercontroller;
    private final CRUDClientController crudClientController;
    private final CRUDDistrictController crudDistrictController;
    private final CRUDAddressController crudAddressController;
    private final CRUDCityController crudCityController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemAddress;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemCity;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemClasse;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemClient;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemCollaborator;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemDistrict;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemMarca;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemProduto;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemSupplier;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
