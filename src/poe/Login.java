/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login {
   
    public boolean checkUserName(UserAccount u) {
        Scanner scanner = new Scanner(System.in);

        // Implement this method
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        return u.getUserName().equals(username);
    }

    public boolean checkPasswordComplexity(String password) {
        //check length
        if (password.length() < 8) {
            return false;
        }

        //check special character, number and capital letter
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();

    }

    public void registerUser(UserAccount u) {
       
        Scanner scanner = new Scanner(System.in);
        String username = "";
        String password = "";

        while (true) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();

            if (username.contains("_") && username.length() <= 5) {
                System.out.println("Username successfully captured");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
            }
        }

        while (true) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
            }
        }

        u.setUserName(username);
        u.setPassword(password);
    }

    public boolean loginUser(UserAccount u) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // checking to see if login details are correct
        if (u.getUserName().equals(username) && u.getPassword().equals(password)) {
            System.out.println("Welcome " + u.getFirstName() + ", " + u.getLastName() + "! It is great to see you again.");
            return true;
        } else {
            System.out.println("Username or password incorrect, please try again");
            return false;
        }
    }

    public void returnLoginStatus(boolean login) {
        if (login) {
            System.out.println("A successful login");
        } else {
            System.out.println("A failed login");
        }
    }
  
}
