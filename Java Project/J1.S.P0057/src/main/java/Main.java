
import java.util.Scanner;

/**
 * Class: Main 
 * Author: Tamnhhe173108 
 * Subject: J1.S.P0057
 *
 * The Main class contains the main method for running the user management
 * system.
 */
public class Main {

    /**
     * Displays the main menu.
     */
    public static void menu() {
        System.out.println(Message.MENU);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Unity unity = new Unity();

        int choice;
        do {
            menu();
            System.out.print(Message.CHOICE);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    unity.createAccount();
                    break;
                case 2:
                    unity.loginAccount();
                    break;
                case 3:
                    System.out.println(Message.EXIST);
                    break;

            }
        } while (choice < 3);

    }

}
