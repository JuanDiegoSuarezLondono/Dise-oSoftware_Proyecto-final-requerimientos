/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignWindows;

import Company.Company;
import User.Admin;
import User.Client;
import User.Employee;

/**
 *
 * @author suare
 */
public class MainAdmin extends javax.swing.JFrame {

    /**
     * Creates new form mainAdmin
     */
    private static Client[] client;
    private static Admin[] admin;
    private static Employee[] employee;
    private static Company company;
    
    public MainAdmin() {
        initComponents();
        
    }
    
     public MainAdmin(Client[] myClient,Admin[] myAdmin, Employee[] myEmployee,Company myCompany) {
        initComponents();
        setVisible(true);
        client = myClient;
        admin = myAdmin;
        employee = myEmployee;
        company = myCompany;
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHeadquarters = new javax.swing.JButton();
        btnProducts = new javax.swing.JButton();
        btnBrands = new javax.swing.JButton();
        btnReferences = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnStock = new javax.swing.JButton();
        lblManage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHeadquarters.setText("Headquarters");
        btnHeadquarters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeadquartersActionPerformed(evt);
            }
        });

        btnProducts.setText("Products");
        btnProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsActionPerformed(evt);
            }
        });

        btnBrands.setText("Brands");
        btnBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandsActionPerformed(evt);
            }
        });

        btnReferences.setText("References");
        btnReferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReferencesActionPerformed(evt);
            }
        });

        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnStock.setText("Stock");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });

        lblManage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblManage.setText("Manage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReferences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHeadquarters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStock, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblManage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(btnProducts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblManage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHeadquarters)
                    .addComponent(btnProducts)
                    .addComponent(btnBrands))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReferences)
                    .addComponent(btnStock)
                    .addComponent(btnReport))
                .addGap(44, 44, 44))
        );

        btnHeadquarters.getAccessibleContext().setAccessibleName("btnHeadquarters");
        btnProducts.getAccessibleContext().setAccessibleName("btnProducts");
        btnBrands.getAccessibleContext().setAccessibleName("btnBrands");
        btnReferences.getAccessibleContext().setAccessibleName("btnReferences");
        btnReferences.getAccessibleContext().setAccessibleDescription("");
        btnReport.getAccessibleContext().setAccessibleName("btnReport");
        btnStock.getAccessibleContext().setAccessibleName("btnStock");
        lblManage.getAccessibleContext().setAccessibleName("lblManage");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHeadquartersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeadquartersActionPerformed
        setVisible(false);
        HeadquarterWindow headquarterWindow = new HeadquarterWindow(client,admin,employee,company);
    }//GEN-LAST:event_btnHeadquartersActionPerformed

    private void btnReferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReferencesActionPerformed
        setVisible(false);
        ReferenceWindow referenceWindow = new ReferenceWindow(client,admin,employee,company);
    }//GEN-LAST:event_btnReferencesActionPerformed

    private void btnProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductsActionPerformed
        setVisible(false);
        ProductWindow productWindow = new ProductWindow(client,admin,employee,company);
    }//GEN-LAST:event_btnProductsActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        setVisible(false);
        StockWindow stockWindow = new StockWindow(client,admin,employee,company);
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandsActionPerformed
        setVisible(false);
        BrandWindow brandWindow = new BrandWindow(client,admin,employee,company);
    }//GEN-LAST:event_btnBrandsActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        setVisible(false);
        ReportWindow reportWindow = new ReportWindow(client,admin,employee,company);
    }//GEN-LAST:event_btnReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrands;
    private javax.swing.JButton btnHeadquarters;
    private javax.swing.JButton btnProducts;
    private javax.swing.JButton btnReferences;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnStock;
    private javax.swing.JLabel lblManage;
    // End of variables declaration//GEN-END:variables
}
