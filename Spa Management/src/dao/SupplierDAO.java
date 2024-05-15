/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Supplier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shisui
 */
public class SupplierDAO extends DAO {
    public SupplierDAO() {
        super();
    }

    /**
     * Get all suppliers from database
     * @param keyword search keyword for supplier name
     * @return a list of all suppliers that match the keyword
     * @see Supplier
     */
    public ArrayList<Supplier> searchSupplier(String keyword) {
        ArrayList<Supplier> suppliers = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblSupplier WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Supplier supplier = new Supplier();
                supplier.setId(rs.getInt("id"));
                supplier.setName(rs.getString("name"));
                supplier.setAddress(rs.getString("address"));
                supplier.setTel(rs.getString("tel"));
                supplier.setTaxCode(rs.getString("taxCode"));
                suppliers.add(supplier);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return suppliers;
    }

    /**
     * Add a new supplier to the database
     * @param s the supplier to be added
     * @return true if the supplier is added successfully, false otherwise
     * @see Supplier
     */
    public boolean addSupplier(Supplier s) {
        String query = "INSERT INTO tblSupplier (name, address, tel, taxCode) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, s.getName());
            ps.setString(2, s.getAddress());
            ps.setString(3, s.getTel());
            ps.setString(4, s.getTaxCode());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                s.setId(rs.getInt(1));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
