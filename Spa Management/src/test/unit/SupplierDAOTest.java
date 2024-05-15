/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.unit;

import dao.SupplierDAO;
import model.Supplier;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 *
 * @author Shisui
 */
public class SupplierDAOTest {
    SupplierDAO sd = new SupplierDAO();

    // searchSupplier with parameter: String keyword
    // return a list of suppliers that match the keyword

    // test case 1: keyword is empty
    @Test
    public void testSearchSupplier1() {
        String keyword = "";
        ArrayList<Supplier> suppliers = sd.searchSupplier(keyword);
        Assert.assertEquals(0, suppliers.size());
        return;
    }

    // test case 2: keyword is not empty
    @Test
    public void testSearchSupplier2() {
        String keyword = "a";
        ArrayList<Supplier> suppliers = sd.searchSupplier(keyword);
        Assert.assertNotEquals(0, suppliers.size());
        Assert.assertTrue(suppliers.stream().allMatch(s -> s.getName().contains(keyword)));
        Assert.assertNotNull(suppliers);
        return;
    }

    // addSupplier with parameter: Supplier s
    // add a new supplier to the database

    // test case 3: supplier is null
    @Test
    public void testAddSupplier1() {
        Supplier s = null;
        Assert.assertFalse(sd.addSupplier(s));
        return;
    }

    // test case 4: supplier is not null
    @Test
    public void testAddSupplier2() {
        Supplier s = new Supplier();
        s.setName("Test");
        s.setAddress("Test");
        s.setTel("Test");
        s.setTaxCode("Test");
        Assert.assertTrue(sd.addSupplier(s));
        return;
    }

    // test case 5: supplier is not null but name is empty
    @Test
    public void testAddSupplier3() {
        Supplier s = new Supplier();
        s.setName("");
        s.setAddress("Test");
        s.setTel("Test");
        s.setTaxCode("Test");
        Assert.assertFalse(sd.addSupplier(s));
        return;
    }
}
