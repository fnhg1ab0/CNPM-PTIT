/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.unit;

import dao.MaterialDAO;
import model.Material;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 *
 * @author Shisui
 */
public class MaterialDAOTest {
    MaterialDAO md = new MaterialDAO();

    // searchMaterial with parameter: String keyword
    // return a list of materials that match the keyword

    // test case 1: keyword is empty
    @Test
    public void testSearchMaterial1() {
        String keyword = "";
        Assert.assertEquals(0, md.searchMaterial(keyword).size());
        return;
    }

    // test case 2: keyword is not empty
    @Test
    public void testSearchMaterial2() {
        String keyword = "a";
        ArrayList<Material> materials = md.searchMaterial(keyword);
        Assert.assertNotEquals(0, materials.size());
        Assert.assertTrue(materials.stream().allMatch(m -> m.getName().contains(keyword)));
        Assert.assertNotNull(materials);
        return;
    }

    // addMaterial with parameter: Material m
    // add a new material to the database

    // test case 3: material is null
    @Test
    public void testAddMaterial1() {
        Material m = null;
        assert !md.addMaterial(m);
        return;
    }

    // test case 4: material is not null
    @Test
    public void testAddMaterial2() {
        Material m = new Material();
        m.setName("Test");
        m.setDescription("Test");
        m.setPrice(0);
        assert md.addMaterial(m);
        return;
    }

    // test case 5: material is not null but name is empty
    @Test
    public void testAddMaterial3() {
        Material m = new Material();
        m.setName("");
        m.setDescription("Test");
        m.setPrice(0);
        assert !md.addMaterial(m);
        return;
    }
}
