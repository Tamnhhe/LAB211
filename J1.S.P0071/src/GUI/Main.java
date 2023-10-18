

package GUI;

import Manager.TaskManager;
import Resource.Message;

/**
 * Main class for task management.
 * @author Tamnhhe1713108
 * Class SE1811
 * Subject J1.S.P0071
 * Version 1.0
 */
public class Main {

    public static void main(String[] args) {
        TaskManager manage = new TaskManager();
        Unity unity = new Unity();
        manage.tempData();
        while (true) {
            displayMenu();
            int option = unity.getInt(Message.OPTION, Message.WRONG, Message.WRONG, Message.WRONG, Message.MIN_TYPE, Message.MAX_TYPE);
            switch (option) {
                case 1:
                    // Option 1: Add a new task
                    manage.inputTask();
                    break;
                case 2:
                    // Option 2: Delete a task
                    manage.deleteTask();
                    break;
                case 3:
                    // Option 3: Display all tasks
                    manage.displayTask();
                    break;
                case 4:
                    // Option 4: Exit the program
                    System.exit(0);
                    break;
            }
        }
    }

    /**
     * Displays the menu options to the user.
     */
    public static void displayMenu() {
        System.out.println(Message.MENU);
    }

}
