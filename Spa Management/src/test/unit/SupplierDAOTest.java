/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.unit;

import dao.DAO;
import dao.SupplierDAO;
import model.Supplier;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Shisui
 */
public class SupplierDAOTest {
    SupplierDAO sd = new SupplierDAO();

    // searchSupplier with parameter: String keyword
    // return a list of suppliers that match the keyword

    // test case 1: keyword is long, return empty list
    @Test
    public void testSearchSupplierException1() {
        String keyword = "xxxxxxxxxxxxxxxx";
        ArrayList<Supplier> suppliers = sd.searchSupplier(keyword);
        Assert.assertNotNull(suppliers);
        Assert.assertEquals(0, suppliers.size());
        return;
    }

    // test case 2: keyword is short, return empty list
    @Test
    public void testSearchSupplierException2() {
        String keyword = "oo";
        ArrayList<Supplier> suppliers = sd.searchSupplier(keyword);
        Assert.assertNotNull(suppliers);
        Assert.assertEquals(0, suppliers.size());
        return;
    }

    // test case 3: keyword is short, return a list of suppliers
    @Test
    public void testSearchSupplierStandard() {
        String keyword = "go";
        ArrayList<Supplier> suppliers = sd.searchSupplier(keyword);
        Assert.assertNotNull(suppliers);
        Assert.assertEquals(2, suppliers.size());
        for(Supplier s : suppliers) {
            Assert.assertTrue(s.getName().toLowerCase().contains(keyword.toLowerCase()));
        }
        return;
    }

    // addSupplier with parameter: Supplier s
    // return boolean value

    // test case 3: supplier can add into database
    @Test
    public void testAddSupplierStandard() {
        Connection con = DAO.con;
        Supplier s = new Supplier();
        s.setName("Spa Vision");
        s.setAddress("123 Street");
        s.setTel("123456789");
        s.setTaxCode("123456789");
        try {
            con.setAutoCommit(false);
            Assert.assertTrue(sd.addSupplier(s));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(!con.getAutoCommit()) {
                    con.rollback();
                    con.setAutoCommit(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }

    // test case 4: supplier can not add into database (name or taxCode is same with other supplier in database)
    @Test
    public void testAddSupplierException() {
        Connection con = DAO.con;
        Supplier s = new Supplier();
        s.setName("Spa Vision");
        s.setAddress("123 Street");
        s.setTel("123456789");
        s.setTaxCode("0316265669");
        try {
            con.setAutoCommit(false);
            Assert.assertFalse(sd.addSupplier(s));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(!con.getAutoCommit()) {
                    con.rollback();
                    con.setAutoCommit(true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return;
    }
}
