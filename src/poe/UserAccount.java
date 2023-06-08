/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

/**
 *
 * @author Admin
 */
class UserAccount {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    //constructors
    public UserAccount(String fn, String ln, String u, String p) {

        this.firstName = fn;
        this.lastName = ln;
        this.userName = u;
        this.password = p;

    }

    UserAccount(String kyl_1, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String fn) {
        firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String ln) {
        lastName = ln;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String u) {
        userName = u;
    }

    public void setPassword(String p) {
        password = p;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + userName + ", " + password + "]";
    }

}
