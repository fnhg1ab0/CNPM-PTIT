/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.ImportedMaterial;
import model.Invoice;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Shisui
 */
public class InvoiceDAO extends DAO {

        public InvoiceDAO() {
            super();
        }

        /**
         * Add a new invoice to the database
         * @param i the invoice to be added
         * @return true if the invoice is added successfully, false otherwise
         */
        public boolean addInvoice(Invoice i) {
            String checkInvoice = "SELECT * FROM tblInvoice WHERE No = ? AND idSupplier = ?";
            String addInvoice = "INSERT INTO tblInvoice (No, date, tax, idSupplier, idUser) VALUES (?, ?, ?, ?, ?)";
            String addImportedMaterial = "INSERT INTO tblImportedMaterial (quantity, unitPrice, idMaterial, idInvoice) VALUES (?, ?, ?, ?)";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                con.setAutoCommit(false);
                PreparedStatement ps = con.prepareStatement(checkInvoice);
                ps.setString(1, i.getNo());
                ps.setInt(2, i.getSupplier().getId());
                ResultSet rs = ps.executeQuery();
                if(rs.next()){
                    try {
                        con.rollback();
                        con.setAutoCommit(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }

                ps = con.prepareStatement(addInvoice, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, i.getNo());
                ps.setString(2, sdf.format(i.getDate()));
                ps.setDouble(3, i.getTax());
                ps.setInt(4, i.getSupplier().getId());
                ps.setInt(5, i.getBuyer().getId());
                ps.executeUpdate();

                // Get the id of the new invoice
                rs = ps.getGeneratedKeys();
                if(rs.next()){
                    i.setId(rs.getInt(1));

                    // Add imported materials
                    for (ImportedMaterial im : i.getListMaterial()) {

                        // insert imported material
                        ps = con.prepareStatement(addImportedMaterial, Statement.RETURN_GENERATED_KEYS);
                        ps.setInt(1, im.getQuantity());
                        ps.setDouble(2, im.getUnitPrice());
                        ps.setInt(3, im.getMaterial().getId());
                        ps.setInt(4, i.getId());
                        ps.executeUpdate();

                        rs = ps.getGeneratedKeys();
                        if(rs.next()){
                            im.setId(rs.getInt(1));
                        }
                    }
                    // comment below line to keep the data in database because rollback will be called in file unit test
                    con.commit();
                    return true;
                }
            } catch (Exception e) {
                try {               
                    con.rollback();
                }catch(Exception ex) {
                    ex.printStackTrace();
                }
                e.printStackTrace();
            } finally {
                try {
                    // in test mode comment below line to keep the data in database because rollback will be called in file unit test
                    con.setAutoCommit(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
}
