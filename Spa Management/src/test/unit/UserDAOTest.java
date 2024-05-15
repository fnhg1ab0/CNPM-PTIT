/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.unit;

import dao.UserDAO;
import model.User;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Shisui
 */
public class UserDAOTest {
    UserDAO ud = new UserDAO();

    // checkLogin with parameter: User u
    // return boolean value
    // test case 1: username and password are correct
    @Test
    public void testCheckLoginStandard() {
        User u = new User();
        u.setUsername("admin");
        u.setPassword("admin");
        Assert.assertTrue(ud.checkLogin(u));
        return;
    }

    // test case 2: username is correct but password is incorrect
    @Test
    public void testCheckLoginException1() {
        User u = new User();
        u.setUsername("admin");
        u.setPassword("admin1");
        Assert.assertFalse(ud.checkLogin(u));
        return;
    }

    // test case 3: username is incorrect but password is correct
    @Test
    public void testCheckLoginException2() {
        User u = new User();
        u.setUsername("admin1");
        u.setPassword("admin");
        Assert.assertFalse(ud.checkLogin(u));
        return;
    }

    // test case 4: username and password are incorrect
    @Test
    public void testCheckLoginException3() {
        User u = new User();
        u.setUsername("admin1");
        u.setPassword("admin1");
        Assert.assertFalse(ud.checkLogin(u));
        return;
    }
}
