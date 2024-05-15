/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.unit;

import dao.DAO;
import dao.MaterialDAO;
import model.Material;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Shisui
 */
public class MaterialDAOTest {
    MaterialDAO md = new MaterialDAO();

    // searchMaterial with parameter: String keyword
    // return a list of materials that match the keyword

    // test case 1: keyword is long, return empty list
    @Test
    public void testSearchMaterialException1() {
        String keyword = "xxxxxxxxxxxxxxxx";
        ArrayList<Material> materials = md.searchMaterial(keyword);
        Assert.assertNotNull(materials);
        Assert.assertEquals(0, materials.size());
        return;
    }

    // test case 2: keyword is short, return empty list
    @Test
    public void testSearchMaterialException2() {
        String keyword = "ko";
        ArrayList<Material> materials = md.searchMaterial(keyword);
        Assert.assertNotNull(materials);
        Assert.assertEquals(0, materials.size());
        return;
    }

    // test case 3: keyword is short, return a list of materials
    @Test
    public void testSearchMaterialStandard() {
        String keyword = "go";
        ArrayList<Material> materials = md.searchMaterial(keyword);
        Assert.assertNotNull(materials);
        Assert.assertEquals(2, materials.size());
        for(Material m : materials) {
            Assert.assertTrue(m.getName().toLowerCase().contains(keyword.toLowerCase()));
        }
        return;
    }

    // addMaterial with parameter: Material m
    // return boolean value

    // test case 3: material can add to database
    @Test
    public void testAddMaterialStandard() {
        Connection con = DAO.con;
        Material m = new Material();
        m.setName("L’Oréal Professionnel Hair Spa Nourishing Creambath");
        m.setDescription("L’Oréal Professionnel Hair Spa Nourishing Creambath is a nourishing creambath that provides deep nourishment to the hair. It is enriched with water lily and purified water. It is a hair spa creambath that provides deep nourishment to the hair. It is enriched with water lily and purified water. It is a hair spa creambath that provides deep nourishment to the hair. It is enriched with water lily and purified water.");
        m.setPrice(1000000);
        try {
            con.setAutoCommit(false);
            Assert.assertTrue(md.addMaterial(m));
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

    // test case 4: material can not add to database (name is already in database)
    @Test
    public void testAddMaterialException() {
        Connection con = DAO.con;
        Material m = new Material();
        m.setName("Gorgeous in Green Clay Face Mask");
        m.setDescription("Gorgeous in Green Clay Face Mask is a face mask that helps to remove impurities and excess oil from the skin. It is enriched with green clay and purified water. It is a face mask that helps to remove impurities and excess oil from the skin. It is enriched with green clay and purified water. It is a face mask that helps to remove impurities and excess oil from the skin. It is enriched with green clay and purified water.");
        m.setPrice(500000);
        try {
            con.setAutoCommit(false);
            Assert.assertFalse(md.addMaterial(m));
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
