/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.importing;

import model.Invoice;
import model.User;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;

import javax.swing.*;

/**
 *
 * @author Shisui
 */
public class ImportInvoiceFrm extends javax.swing.JFrame implements ActionListener {
    User u;

    /**
     * Creates new form ImportInvoice
     */
    public ImportInvoiceFrm(User u) {
        initComponents();
        this.u = u;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.getHSBColor(106, 52, 50));
        // set center for lblFrm in the current JFrame
        this.lblFrm.setLocation((this.getWidth() - this.lblFrm.getWidth()) / 2, this.lblFrm.getY());
        this.txtNo.setSize(175, 33);
        this.txtDate.setSize(175, 33);
        this.txtTax.setSize(175, 33);
        this.setLayout(null);
        this.lblFullname.setText(u.getFullname());
        this.lblRole.setText(u.getRole());
        this.btnImport.addActionListener(this);
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
        lblNo = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtDate = new DatePicker();
        txtTax = new javax.swing.JTextField();
        btnImport = new javax.swing.JButton();
        lblFFN = new javax.swing.JLabel();
        lblFR = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFrm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFrm.setText("Invoice information");

        lblNo.setText("No");

        lblDate.setText("Date");

        lblTax.setText("Tax");

        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        lblFFN.setText("Name:");

        lblFR.setText("Role:");

        lblFullname.setText("Nguyen Dang Quang");

        lblRole.setText("Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lblFFN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate)
                                    .addComponent(txtNo, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(100, 100, 100))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFrm)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFullname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lblFR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFFN)
                    .addComponent(lblFullname)
                    .addComponent(lblFR)
                    .addComponent(lblRole))
                .addGap(18, 18, 18)
                .addComponent(lblFrm)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnImport)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportActionPerformed

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
            java.util.logging.Logger.getLogger(ImportInvoiceFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImportInvoiceFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImportInvoiceFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImportInvoiceFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportInvoiceFrm(new User()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImport;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFFN;
    private javax.swing.JLabel lblFR;
    private javax.swing.JLabel lblFrm;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTax;
    private DatePicker txtDate;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtTax;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnImport) {
            String checkNo = txtNo.getText();
            String checkDate = txtDate.getText();
            String checkTax = txtTax.getText();
            if (checkNo.isEmpty() || checkDate.isEmpty() || checkTax.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields!");
                return;
            }

            Invoice i = new Invoice();
            i.setNo(txtNo.getText());

            int month = txtDate.getDate().getMonthValue();

            int monthCalendar = switch (month) {
                case 2 -> Calendar.FEBRUARY;
                case 3 -> Calendar.MARCH;
                case 4 -> Calendar.APRIL;
                case 5 -> Calendar.MAY;
                case 6 -> Calendar.JUNE;
                case 7 -> Calendar.JULY;
                case 8 -> Calendar.AUGUST;
                case 9 -> Calendar.SEPTEMBER;
                case 10 -> Calendar.OCTOBER;
                case 11 -> Calendar.NOVEMBER;
                case 12 -> Calendar.DECEMBER;
                default -> Calendar.JANUARY;
            };
            Date date = new GregorianCalendar(txtDate.getDate().getYear(), monthCalendar, txtDate.getDate().getDayOfMonth()).getTime();
            i.setDate(date);
            i.setTax(Double.parseDouble(txtTax.getText()));
            i.setBuyer(u);
            SearchSupplierFrm searchSupplierFrm = new SearchSupplierFrm(i);
            searchSupplierFrm.setVisible(true);
            this.dispose();
        }
    }
    // End of variables declaration//GEN-END:variables
}