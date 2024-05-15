/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Material;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shisui
 */
public class MaterialDAO extends DAO {
    public MaterialDAO() {
        super();
    }

    /**
     * Get all materials from the database
     * @param keyword the keyword to search for material name
     * @return a list of all materials that match the keyword
     * @see Material
     */
    public ArrayList<Material> searchMaterial(String keyword) {
        ArrayList<Material> materials = new ArrayList<>();
        try {
            String query = "SELECT * FROM tblMaterial WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Material material = new Material();
                material.setId(rs.getInt("id"));
                material.setName(rs.getString("name"));
                material.setPrice(rs.getInt("price"));
                material.setDescription(rs.getString("description"));
                materials.add(material);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return materials;
    }

    /**
     * Add a new material to the database
     * @param m the material to be added
     * @return true if the material is added successfully, false otherwise
     * @see Material
     */
    public boolean addMaterial(Material m) {
        String query = "INSERT INTO tblMaterial (name, description, price) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, m.getName());
            ps.setString(2, m.getDescription());
            ps.setDouble(3, m.getPrice());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                m.setId(rs.getInt(1));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
