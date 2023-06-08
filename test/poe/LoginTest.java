/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.Scanner;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class LoginTest {

    private UserAccount user;
    private Login login;
    private Object scanner;

    public LoginTest() {

    }

    /**
     *
     * This is a JUnit test class for the Login Class in the POE package.
     *
     */
    @Test
    public void testCheckUserName() {
        Login login = new Login();
        String username = "kyl_1";
        boolean actual = login.checkUserName(user);
        assertTrue(actual);
    }

    @Test
    public void testCheckUserNameFail() {
        Login login = new Login();
        String username = "kym";
        boolean actual = login.checkUserName(user);
        assertFalse(actual);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login. this method tests
     * whether the checkPasswordComplexity method correctly identifies a complex
     * password. it passes a complex password string to this method and tests
     * whether it returns true
     */
    @Test
    public void testCheckPasswordComplexityPass() {
        Login login = new Login();

        String password = "Ch&&sec@ke99!";
        boolean actual = login.checkPasswordComplexity(password);

        assertTrue(actual);
    }

    @Test
    public void testCheckPasswordComplexityFail() {
        Login login = new Login();

        String password = "jkiuyyt";
        boolean actual = login.checkPasswordComplexity(password);

        assertFalse(actual);
    }

    /**
     * Test of registerUser method, of class Login. This method tests whether
     * the registerUser method correctly registers a new user. 
     */
   
    @Test
    public void testRegisterUserValid() {
        Login login = new Login();

        String password = "Ch&&sec@ke99!";
        boolean actual = login.checkPasswordComplexity(password);

        assertTrue(actual);
    }
    @Test
    public void testRegisterUserInvalid() {
        Login login = new Login();

        String password = "";
        boolean actual = login.checkPasswordComplexity(password);

        assertFalse(actual);
    }

    /**
     * Test of loginUser method, of class Login.
     *
     * This method tests whether the loginUser method correctly logs in a user.
     * It creates a UserAccount object and tests whether loginUser returns true
     */
    @Test
    public void testLoginUserValid() {
        UserAccount u = new UserAccount("kyl_1", "Ch&&sec@ke99!");
        Login instance = new Login();
        user.getUserName();
        user.getPassword();
        user.getFirstName();
        user.getLastName();
        
        boolean actual = login.loginUser(u);

        assertTrue(instance.loginUser(u));
    }

    @Test
    public void testLoginUserInvalid() {
        Login instance = new Login();
        user.setUserName("kyl_1");
        user.setPassword("wrongpassword");
        assertFalse(login.loginUser(user));
    }

    /**
     * Test of returnLoginStatus method, of class Login. This method tests
     * whether the returnLoginStatus method correctly sets the login status
     */
    @Test

    public void testReturnLoginStatusPass() {
        System.out.println("testReturnLoginStatus");
        Login instance = new Login();
        boolean login = true;
        instance.returnLoginStatus(login);
    }
      public void testReturnLoginStatusFail() {
        System.out.println("testReturnLoginStatus");
        Login instance = new Login();
        boolean login = false;
        instance.returnLoginStatus(login);
    }

    private void assertEquals(String expected1, boolean expected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
