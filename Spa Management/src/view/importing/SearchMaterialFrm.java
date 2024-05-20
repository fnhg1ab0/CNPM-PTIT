/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.importing;

import dao.MaterialDAO;
import model.ImportedMaterial;
import model.Invoice;
import model.Material;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shisui
 */
public class SearchMaterialFrm extends javax.swing.JFrame implements ActionListener {
    private Invoice i;
    private ArrayList<ImportedMaterial> importedMaterial = new ArrayList<>();
    private ArrayList<Material> material;

    /**
     * Creates new form SearchMaterial
     */
    public SearchMaterialFrm(Invoice i) {

        initComponents();
        this.i = i;
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.getHSBColor(106, 52, 50));
        this.setLayout(null);
        this.setSize(900, 810);

        this.lblFullname.setText(i.getBuyer() != null ? i.getBuyer().getFullname() : "");
        this.lblRole.setText(i.getBuyer() != null ? i.getBuyer().getRole() : "");
        this.btnSearch.addActionListener(this);
        this.btnImport.addActionListener(this);
        this.btnConfirm.addActionListener(this);
        this.btnDelete.addActionListener(this);
        this.btnAddMaterial.addActionListener(this);

        this.tblMaterial.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = tblMaterial.rowAtPoint(evt.getPoint());
                if(row == -1){
                    return;
                }
                txtImportID.setText(tblMaterial.getValueAt(row, 0).toString());
                txtImportName.setText(tblMaterial.getValueAt(row, 1).toString());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        lblFrm = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMaterial = new javax.swing.JTable();
        btnAddMaterial = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblImportedMaterial = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lblMaterial = new javax.swing.JLabel();
        lblImportedMaterial = new javax.swing.JLabel();
        lblImport = new javax.swing.JLabel();
        lblImportID = new javax.swing.JLabel();
        lblImportName = new javax.swing.JLabel();
        lblImportQuantity = new javax.swing.JLabel();
        lblImportUP = new javax.swing.JLabel();
        txtImportID = new javax.swing.JTextField();
        txtImportName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        lblFFN = new javax.swing.JLabel();
        lblFR = new javax.swing.JLabel();
        lblFullname = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFrm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFrm.setText("Search Material");

        lblName.setText("Name:");

        btnSearch.setText("Search");

        tblMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Description", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMaterial);

        btnAddMaterial.setText("Add Material");

        btnImport.setText("Import");

        tblImportedMaterial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Imported Quantity", "Unit Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblImportedMaterial);

        btnDelete.setText("Delete");

        btnConfirm.setText("Confirm");

        lblMaterial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaterial.setText("Available Material:");

        lblImportedMaterial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblImportedMaterial.setText("Imported Material:");

        lblImport.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblImport.setText("Import:");

        lblImportID.setText("ID:");

        lblImportName.setText("Name:");

        lblImportQuantity.setText("Quantity:");

        lblImportUP.setText("Unit Price:");

        txtImportID.setForeground(new java.awt.Color(102, 102, 102));
        txtImportID.setEnabled(false);

        txtImportName.setEnabled(false);

        lblFFN.setText("Name:");

        lblFR.setText("Role:");

        lblFullname.setText("Nguyen Quang Dang");

        lblRole.setText("Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFrm)
                                .addGap(111, 111, 111))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnSearch)))
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblImportedMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblImport)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblMaterial)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddMaterial))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblImportQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtQuantity))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lblImportID, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtImportID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblImportUP)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtUnitPrice))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblImportName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtImportName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFFN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFullname)
                        .addGap(38, 38, 38)
                        .addComponent(lblFR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullname)
                    .addComponent(lblRole)
                    .addComponent(lblFR)
                    .addComponent(lblFFN, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFrm)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterial)
                    .addComponent(btnAddMaterial))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImport)
                    .addComponent(btnImport))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImportID)
                            .addComponent(txtImportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImportQuantity)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImportName)
                            .addComponent(txtImportName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImportUP)
                            .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblImportedMaterial)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm))
                .addGap(16, 16, 16))
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
            java.util.logging.Logger.getLogger(SearchMaterialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchMaterialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchMaterialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchMaterialFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchMaterialFrm(new Invoice()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMaterial;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblFFN;
    private javax.swing.JLabel lblFR;
    private javax.swing.JLabel lblFrm;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblImport;
    private javax.swing.JLabel lblImportID;
    private javax.swing.JLabel lblImportName;
    private javax.swing.JLabel lblImportQuantity;
    private javax.swing.JLabel lblImportUP;
    private javax.swing.JLabel lblImportedMaterial;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    private javax.swing.JTable tblImportedMaterial;
    private javax.swing.JTable tblMaterial;
    private javax.swing.JTextField txtImportID;
    private javax.swing.JTextField txtImportName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtUnitPrice;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSearch) {
            String name = txtName.getText();
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please enter the name of the material");
                return;
            }
            MaterialDAO md = new MaterialDAO();
            material = md.searchMaterial(name);
            if(material.isEmpty()){
                JOptionPane.showMessageDialog(this, "The material does not found! Please add new material or choose another material.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblMaterial.getModel();
            model.setRowCount(0);
            for (Material m : material) {
                model.addRow(new Object[]{
                        m.getId(),
                        m.getName(),
                        m.getDescription(),
                        m.getPrice()
                });
            }
            tblMaterial.setModel(model);
        } else if (e.getSource() == btnAddMaterial) {
            AddMaterialFrm addMaterialFrm = new AddMaterialFrm();
            addMaterialFrm.setVisible(true);
        } else if (e.getSource() == btnImport) {
            DefaultTableModel model = (DefaultTableModel) tblImportedMaterial.getModel();
            int row = tblMaterial.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a material to import");
            } else {
                String quantity = txtQuantity.getText();
                String unitPrice = txtUnitPrice.getText();
                if (quantity.isEmpty() || unitPrice.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter the quantity and unit price");
                    return;
                }
                int id = (int) tblMaterial.getValueAt(row, 0);
                int rowId = -1;
                boolean existed = false;
                for (int i = 0; i < model.getRowCount(); i++) {
                    if ((int) model.getValueAt(i, 0) == id) {
                        rowId = i;
                        existed = true;
                        break;
                    }
                }
                if (existed) {
                    int newQuantity = (int) model.getValueAt(rowId, 2) + Integer.parseInt(quantity);
                    double newUnitPrice = (double) model.getValueAt(rowId, 3);

                    if(newUnitPrice != Double.parseDouble(unitPrice)){
                        JOptionPane.showMessageDialog(this, "The unit price of the material is different from the previous one");
                        return;
                    }

                    model.setValueAt(newQuantity, rowId, 2);
                    model.setValueAt(newUnitPrice, rowId, 3);
                    model.setValueAt(newQuantity * newUnitPrice, rowId, 4);
                    tblImportedMaterial.setModel(model);
                    ImportedMaterial im = importedMaterial.get(rowId);
                    im.setQuantity(newQuantity);
                    im.setUnitPrice(newUnitPrice);
                    importedMaterial.set(rowId, im);
                } else {
                    model.addRow(new Object[]{
                            tblMaterial.getValueAt(row, 0),
                            tblMaterial.getValueAt(row, 1),
                            Integer.parseInt(quantity),
                            Double.parseDouble(unitPrice),
                            Integer.parseInt(quantity) * Double.parseDouble(unitPrice)
                    });
                    tblImportedMaterial.setModel(model);
                    ImportedMaterial im = new ImportedMaterial();
                    im.setQuantity(Integer.parseInt(quantity));
                    im.setUnitPrice(Double.parseDouble(unitPrice));
                    Material m = new Material();
                    m.setId((int) tblMaterial.getValueAt(row, 0));
                    m.setName((String) tblMaterial.getValueAt(row, 1));
                    im.setMaterial(m);
                    importedMaterial.add(im);
                }
            }
        } else if (e.getSource() == btnDelete) {
            DefaultTableModel model = (DefaultTableModel) tblImportedMaterial.getModel();
            int row = tblImportedMaterial.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Please select a material to delete");
            } else {
                model.removeRow(row);
                importedMaterial.remove(row);
            }
        } else if (e.getSource() == btnConfirm) {
            if(importedMaterial.isEmpty()){
                JOptionPane.showMessageDialog(this, "Please import at least one material");
                return;
            }
            i.setListMaterial(importedMaterial);
            double total = 0;
            for (ImportedMaterial importedMaterial : importedMaterial) {
                total += importedMaterial.getQuantity() * importedMaterial.getUnitPrice();
            }
            i.setTotalAmount(total);
            ConfirmFrm confirmFrm = new ConfirmFrm(i);
            confirmFrm.setVisible(true);
            this.dispose();
        }
    }
    // End of variables declaration//GEN-END:variables
}
