/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.unit;

import dao.InvoiceDAO;
import dao.UserDAO;
import model.*;
import org.junit.Assert;
import org.junit.Test;

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
    // add a new invoice to the database

    // test case 1: invoice is null
    @Test
    public void testAddInvoice1() {
        Assert.assertFalse(id.addInvoice(null));
        return;
    }

    // test case 2: invoice is not null
    @Test
    public void testAddInvoice2() {
        Invoice i = new Invoice();
        i.setNo("1");
        // set date to 2021-01-01
        i.setDate(new GregorianCalendar(2021, Calendar.JANUARY, 1).getTime());
        i.setTax(0.1);
        i.setTotalAmount(1000);
        i.setPaidAmount(1000);

        User u = new User();
        u.setId(1);
        u.setUsername("user");
        u.setPassword("pass");
        u.setFullname("fullname");
        u.setRole("role");
        i.setBuyer(u);

        Supplier s = new Supplier();
        s.setId(1);
        s.setName("supplier");
        s.setAddress("address");
        s.setTel("tel");
        s.setTaxCode("taxCode");
        i.setSupplier(s);

        ArrayList<ImportedMaterial> listMaterial = new ArrayList<>();
        Material m = new Material();
        m.setId(1);
        m.setName("material");
        m.setDescription("description");
        m.setPrice(100);
        ImportedMaterial im = new ImportedMaterial();
        im.setId(1);
        im.setMaterial(m);
        im.setQuantity(10);
        im.setUnitPrice(100);
        listMaterial.add(im);
        i.setListMaterial(listMaterial);

        Assert.assertTrue(id.addInvoice(i));
        return;
    }
}
