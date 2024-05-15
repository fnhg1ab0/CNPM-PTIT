/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Shisui
 */
public class DAO {
    public static Connection con;
    
    public DAO() {
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/";
            String dbClass = "com.mysql.cj.jdbc.Driver";
            String dbName = "spa_management";
            String dbErp = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String dbUser = "root";
            String dbPass = "root123";
            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection (dbUrl + dbName + dbErp, dbUser, dbPass);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
