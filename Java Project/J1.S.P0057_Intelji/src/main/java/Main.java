

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    ArrayList<Account> list = new ArrayList<>();

    public static void menu() {
        System.out.println(Message.MENU);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main ite = new Main();

        int choice;
        do {
            menu();
            System.out.print(Message.CHOICE);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ite.creat();
                    break;
                case 2:
                    ite.login();
                    break;
                case 3:
                    System.out.println(Message.EXIST);
                    break;

            }
        } while (choice < 3);

    }

    public boolean checkUser(String str) {
        if (str.contains(" ") || str.length() < Message.MIN_LENGTH_USERNAME) {
            return false;
        } else return true;
    }

    public boolean checkPass(String str) {
        if (str.contains(" ") || str.length() < Message.MIN_LENGTH_PASSWORD) {
            return false;
        } else return true;
    }

    public void creat() {
        Scanner scanner = new Scanner(System.in);
        String acc, pass;
        do {
            System.out.print(Message.INPUT_USERNAME);
            acc = scanner.nextLine();
            if (checkUser(acc)) {
                break;
            } else System.out.println(Message.ERROR_USERNAME);
        } while (true);
        do {
            System.out.print(Message.INPUT_PASSWORD);
            pass = scanner.nextLine();
            if (checkPass(pass)) {
                break;
            } else System.out.println(Message.ERROR_PASSWORD);
        } while (true);
        Account a = new Account(acc, pass);
        list.add(a);


    }

    public void login() {
        Scanner scanner = new Scanner(System.in);
        boolean find = false;
        System.out.print(Message.INPUT_USERNAME);
        String user = scanner.nextLine();
        System.out.print(Message.INPUT_PASSWORD);
        String pass = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals(user) && list.get(i).getPass().equals(pass)) {
                find = true;
                break;
            }
        }
        if (find == true) {
            System.out.println(Message.SUCCESSFULL);
        } else System.out.println(Message.INVALID);

    }

}
