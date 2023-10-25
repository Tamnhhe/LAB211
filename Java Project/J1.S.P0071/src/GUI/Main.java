package GUI;

import Manager.TaskManager;
import Resource.Message;

/**
 * Main class for task management.
 *
 * @author Tamnhhe173108.
 * Class SE1811.
 * Subject J1.S.P0071.
 */
public class Main {
    /**
     * Choose option to run the program
     */
    public static void main(String[] args) {
        // Create a TaskManager instance and a Unity instance
        TaskManager manage = new TaskManager(); 
        Unity unity = new Unity();
        // Call the templateData method on the TaskManager object
        manage.templateData();
        while (true) {
            displayMenu();
            int option = unity.getInt(Message.OPTION, Message.WRONG, Message.WRONG, Message.WRONG, Message.MIN_TYPE, Message.MAX_TYPE);
            switch (option) {
                case 1:
                    // Option 1: Add a new task.
                    manage.inputTask();
                    break;
                case 2:
                    // Option 2: Delete a task by id.
                    manage.deleteTask();
                    break;
                case 3:
                    // Option 3: Display all tasks.
                    manage.displayTask();
                    break;
                case 4:
                    // Option 4: Exits the program.
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
