/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.unit;

import dao.DAO;
import dao.InvoiceDAO;
import dao.UserDAO;
import model.*;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Shisui
 */
public class InvoiceDAOTest {
    InvoiceDAO id = new InvoiceDAO();

    // addInvoice with parameter: Invoice i
    // return boolean value

    // NOTE: Before running the test cases, you need to comment out the line 82 and 95 in InvoiceDAO.java

    // test case 1: supplier exists, material exists, invoice can add to database
    @Test
    public void testAddInvoiceStandard() {
        Connection con = DAO.con;
        Invoice i = new Invoice();
        i.setNo("1236823");
        i.setDate(new Date());
        i.setTax(10);

        User u = new User();
        u.setId(2);
        i.setBuyer(u);

        Supplier s = new Supplier();
        s.setId(1);
        i.setSupplier(s);

        Material m = new Material();
        m.setId(1);

        ImportedMaterial im = new ImportedMaterial();
        im.setMaterial(m);
        im.setQuantity(10);
        im.setUnitPrice(100000);

        ArrayList<ImportedMaterial> ims = new ArrayList<>();
        ims.add(im);

        i.setListMaterial(ims);

        try {
            con.setAutoCommit(false);
            Assert.assertTrue(id.addInvoice(i));
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

    // test case 2: supplier does not exist, invoice cannot add to database
    @Test
    public void testAddInvoiceException1() {
        Connection con = DAO.con;
        Invoice i = new Invoice();
        i.setNo("123");
        i.setDate(new Date());
        i.setTax(10);

        User u = new User();
        u.setId(2);
        i.setBuyer(u);

        Supplier s = new Supplier();
        s.setId(100);
        i.setSupplier(s);

        Material m = new Material();
        m.setId(1);

        ImportedMaterial im = new ImportedMaterial();
        im.setMaterial(m);
        im.setQuantity(10);
        im.setUnitPrice(100000);

        ArrayList<ImportedMaterial> ims = new ArrayList<>();
        ims.add(im);

        i.setListMaterial(ims);

        try {
            con.setAutoCommit(false);
            Assert.assertFalse(id.addInvoice(i));
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

    // test case 3: material does not exist, invoice cannot add to database
    @Test
    public void testAddInvoiceException2() {
        Connection con = DAO.con;
        Invoice i = new Invoice();
        i.setNo("123");
        i.setDate(new Date());
        i.setTax(10);

        User u = new User();
        u.setId(2);
        i.setBuyer(u);

        Supplier s = new Supplier();
        s.setId(1);
        i.setSupplier(s);

        Material m = new Material();
        m.setId(100);

        ImportedMaterial im = new ImportedMaterial();
        im.setMaterial(m);
        im.setQuantity(10);
        im.setUnitPrice(100000);

        ArrayList<ImportedMaterial> ims = new ArrayList<>();
        ims.add(im);

        i.setListMaterial(ims);

        try {
            con.setAutoCommit(false);
            Assert.assertFalse(id.addInvoice(i));
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

    // test case 4: supplier exists, material exists, invoice cannot add to database (invoice no and idSupplier are existed at the same row in tblInvoice)
    @Test
    public void testAddInvoiceException3() {
        Connection con = DAO.con;
        Invoice i = new Invoice();
        i.setNo("12345");
        i.setDate(new Date());
        i.setTax(10);

        User u = new User();
        u.setId(2);
        i.setBuyer(u);

        Supplier s = new Supplier();
        s.setId(1);
        i.setSupplier(s);

        Material m = new Material();
        m.setId(1);

        ImportedMaterial im = new ImportedMaterial();
        im.setMaterial(m);
        im.setQuantity(10);
        im.setUnitPrice(100000);

        ArrayList<ImportedMaterial> ims = new ArrayList<>();
        ims.add(im);

        i.setListMaterial(ims);

        try {
            con.setAutoCommit(false);
            Assert.assertFalse(id.addInvoice(i));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (!con.getAutoCommit()) {
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
