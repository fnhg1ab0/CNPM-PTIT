/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.importing;

import view.user.ManagerHomeFrm;
import model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Shisui
 */
public class ImportingManageFrm extends javax.swing.JFrame implements ActionListener {
    private User u;

    /**
     * Creates new form ImportingManage
     */
    public ImportingManageFrm(User u) {
        initComponents();
        this.u = u;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.getHSBColor(106, 52, 50));
        this.setLayout(null);
        this.lblFullname.setText(u.getFullname());
        this.lblRole.setText(u.getRole());
        this.btnImport.addActionListener(this);
        this.btnAllImport.addActionListener(this);
        this.btnCancel.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFrm = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();
        btnAllImport = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblFFN = new javax.swing.JLabel();
        lblFR = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFrm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFrm.setText("Importing Management");

        btnImport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnImport.setText("Import");

        btnAllImport.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAllImport.setText("All importing invoices");

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCancel.setText("Cancel");

        lblFFN.setText("Name: ");

        lblFR.setText("Role: ");

        lblFullname.setText("Nguyen Quang Dang");

        lblRole.setText("Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAllImport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnImport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30))
                            .addComponent(lblFrm))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFFN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFullname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFFN)
                    .addComponent(lblFR)
                    .addComponent(lblFullname)
                    .addComponent(lblRole))
                .addGap(39, 39, 39)
                .addComponent(lblFrm)
                .addGap(34, 34, 34)
                .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAllImport, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ImportingManageFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportingManageFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportingManageFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportingManageFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportingManageFrm(new User()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllImport;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnImport;
    private javax.swing.JLabel lblFFN;
    private javax.swing.JLabel lblFR;
    private javax.swing.JLabel lblFrm;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblRole;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnImport) {
            new ImportInvoiceFrm(u).setVisible(true);
            this.dispose();
        } else if (e.getSource() == btnAllImport) {
            JOptionPane.showMessageDialog(this, "This feature is not available yet");
        } else if (e.getSource() == btnCancel) {
            new ManagerHomeFrm(u).setVisible(true);
            this.dispose();
        }
    }
    // End of variables declaration//GEN-END:variables
}
