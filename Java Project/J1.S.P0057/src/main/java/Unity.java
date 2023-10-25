import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class: Unity
 * Author: Tamnhhe173108
 * Subject: J1.S.P0057
 * 
 * The Unity class provides methods for checking and creating user accounts.
 */
public class Unity {

    // List to store user accounts
    private final ArrayList<Account> list = new ArrayList<>();

    /**
     * Checks if a given username is valid.
     * 
     * @param result The username to be checked.
     * @return True if the username is valid, false otherwise.
     */
    public boolean checkUser(String result) {
        if (result.contains(" ") || result.length() < Message.MIN_LENGTH_USERNAME) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Checks if a given password is valid.
     * 
     * @param result The password to be checked.
     * @return True if the password is valid, false otherwise.
     */
    public boolean checkPass(String result) {
        if (result.contains(" ") || result.length() < Message.MIN_LENGTH_PASSWORD) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Creates a new user account.
     */
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        do {
            System.out.print(Message.INPUT_USERNAME);
            username = scanner.nextLine();
            if (checkUser(username)) {
                break;
            } else {
                System.out.println(Message.ERROR_USERNAME);
            }
        } while (true);
        do {
            System.out.print(Message.INPUT_PASSWORD);
            password = scanner.nextLine();
            if (checkPass(password)) {
                break;
            } else {
                System.out.println(Message.ERROR_PASSWORD);
            }
        } while (true);
        Account account = new Account(username, password);
        list.add(account);

    }

    /**
     * Logs in to an existing user account.
     */
    public void loginAccount() {
        Scanner scanner = new Scanner(System.in);
        boolean find = false;

        System.out.print(Message.INPUT_USERNAME);
        String username = scanner.nextLine();

        System.out.print(Message.INPUT_PASSWORD);
        String password = scanner.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(username) && list.get(i).getPass().equals(password)) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println(Message.SUCCESSFULL);
        } else {
            System.out.println(Message.INVALID);
        }
    }
}
