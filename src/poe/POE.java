/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe;

/**
 *
 * @author ST10298329
 */
import java.util.Scanner;

public class POE {
    
    private static void printMenu(){
        menu();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        UserAccount user = new UserAccount("first name", "last name", "username", "password");
        user.getFirstName();
        user.getLastName();
        user.getUserName();
        user.getPassword();

        Login aLogin = new Login();
        aLogin.checkUserName(user);
        String password = "";
        aLogin.checkPasswordComplexity(password);
        aLogin.registerUser(user);
        aLogin.loginUser(user);
        aLogin.returnLoginStatus(true);

        dispatchLoop();
    }

    public static void menu() {

        System.out.println("1..Create a User Account");
        System.out.println("2..Login User");
        System.out.println("3..Display User Details");
        System.out.println("4..Quit");
    }

    public static String getAChoice(Scanner input) {
        return input.nextLine();
    }

    public static UserAccount createUserAccount(Scanner input) {

        //get user inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first name:");
        String fn = input.nextLine();
        System.out.println("Enter a last name:");
        String ln = input.nextLine();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a username:");
        String u = input.nextLine();
        System.out.println("Enter a password:");
        String p = input.nextLine();

        UserAccount user = new UserAccount(fn, ln, u, p);

        return user;
    }

    public static void display(UserAccount u) {
        System.out.println(u.toString());
    }

    public static void dispatchLoop() {
        Scanner input = new Scanner(System.in);
        UserAccount user = new UserAccount("dummy", "dummy", "dummy", "dummy");
        Login controller = new Login();
        printMenu();

        while (true) {
           menu();  // call menu() method before getting user input
            String choice = getAChoice(input);
            switch (choice) {

                case "1":
                    user = createUserAccount(input);
                    break;
                case "2":
                    if (controller.loginUser(user)) {
                        System.out.println("Logged in successfully.");
                    } else {
                        System.out.println("Login failed.");
                    }
                    break;
                case "3":
                    display(user);
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
