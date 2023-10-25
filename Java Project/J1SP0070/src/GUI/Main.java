/**
 * Class: Main
 * Author: Tamnhhe173108
 * Subject: J.S.P0070
 * 
 * The Main class contains the main method for running the login program.
 */
package GUI;

import manager.AccountManager;
import manager.Message;

public class Main {

    /**
     * The main method of the program.
     * 
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Unity unity = new Unity();
        AccountManager manager = new AccountManager();
        manager.UsersData();
        Message message = new Message();

        while (true) {
            unity.displayMenu();
            int option = unity.checkInputChoice(message.OPTION, message.MIN_OPTION, message.MAX_OPTION);
            switch (option) {
                case 1:
                    manager.loginVietnamese();
                    break;
                case 2:
                    manager.loginEnglish();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }
    }
}
