/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Shisui
 */
public class UserDAO extends DAO {
    public UserDAO() {
        super();
    }

    /**
     * Check if the information provided by the user: username and password is existed in the database
     * @param u User object
     * @return true if the information is correct, false otherwise
     * @see User
     */
    public boolean checkLogin(User u) {
        String query = "SELECT * FROM tblUser WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setId(rs.getInt("ID"));
                u.setRole(rs.getString("role"));
                u.setFullname(rs.getString("fullname"));
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
