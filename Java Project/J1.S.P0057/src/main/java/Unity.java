
import java.util.Scanner;
import java.util.ArrayList;

public class Unity {

    private final ArrayList<Account> list = new ArrayList<>();

    public boolean checkUser(String result) {
        if (result.contains(" ") || result.length() < Message.MIN_LENGTH_USERNAME) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkPass(String result) {
        if (result.contains(" ") || result.length() < Message.MIN_LENGTH_PASSWORD) {
            return false;
        } else {
            return true;
        }
    }

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
        if (find == true) {
            System.out.println(Message.SUCCESSFULL);
        } else {
            System.out.println(Message.INVALID);
        }

    }
}
