
package GUI;

import java.util.Scanner;

/**
 * Class: Unity
 * Author: Tamnhhe173108
 * Subject: J.S.P0070
 * 
 * The Unity class provides methods for displaying a menu, validating user input, and getting a string input from the user.
 */
public class Unity {
    Scanner scanner = new Scanner(System.in);

    /**
     * Displays the menu for the login program.
     */
    public void displayMenu(){
        System.out.println("-------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
    }

    /**
     * Checks and validates the user's choice within a specified range.
     * 
     * @param message The message prompt for user input.
     * @param min The minimum valid choice.
     * @param max The maximum valid choice.
     * @return The validated user's choice.
     */
    public int checkInputChoice(String message, int min, int max){
        while(true){
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                // Check input is empty or not
                if(!input.isEmpty()){
                    int number = Integer.parseInt(input);
                    if(number < min || number > max){
                        System.out.println("Your choice must be number in range " + min + " - " +max);
                        continue;
                    }
                    return number;
                }else{
                    System.out.println("Your choice cannot be empty!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Your choice must be a number");
            }
        }
    }

    /**
     * Gets and validates a string input from the user based on a regular expression.
     * 
     * @param message The message prompt for user input.
     * @param error The error message displayed if the input is invalid.
     * @param regex The regular expression pattern for validation.
     * @return The validated string input from the user.
     */
    public String getString(String message, String error, String regex){
        while(true){
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if(input.isEmpty()){
                System.out.println("Input cannot be empty");
            }else{
                if(input.matches(regex)){
                    return input;
                }else{
                    System.out.println(error);
                }
            }
        }
    }
}
