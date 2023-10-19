package GUI;

import java.util.Scanner;
import Resource.Message;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class for handling user input operations.
 *
 * @author Tamnhhe173108 
 * Class SE1811 
 * Subject J1.S.P0071 
 * Version 1.0
 */
public class Unity {
    
    /**
     * Get an integer input from the user within a specified range
     */
    Scanner scanner = new Scanner(System.in);
    /**
     * 
     * @param message Prompt message for user input
     * @param firstError Error message for input below range
     * @param secondError Error message for input above range
     * @param thirdError Error message for non-integer input
     * @param min Minimum value allowed
     * @param max Maximum value allowed
     * @return Validated integer input
     */
    public int getInt(String message, String firstError, String secondError, String thirdError, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println(Message.WRONG_INPUT);
                } else {
                    int number = Integer.parseInt(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }
    
    /**
     * Get an Double input from the user within a specified range
     */
    public double getDouble(String message, String firstError, String secondError, String thirdError, double min, double max) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println(Message.WRONG_INPUT);
                } else {
                    double number = Double.parseDouble(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }
    
    /**
     * Get an Float input from the user within a specified range
     */
    public float getFloat(String message, String firstError, String secondError, String thirdError, double min, double max) {
        while (true) {
            try {
                System.out.println(message);
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println(Message.WRONG_INPUT);
                } else {
                    float number = Float.parseFloat(input);
                    if (number < min) {
                        System.out.println(firstError);
                    } else if (number > max) {
                        System.out.println(secondError);
                    } else {
                        return number;
                    }
                }
            } catch (Exception e) {
                System.out.println(thirdError);
            }
        }
    }
    
    /**
     * Get String from input by user
     * @param message Notice user enter the input
     * @param error Error message for input below range
     * @param regex Wrong format input
     * @return String input
     */
    public String getString(String message, String error, String regex) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(Message.WRONG_INPUT);
            } else {
                if (input.matches(regex)) {
                    return input;
                } else {
                    System.out.println(error);
                }
            }
        }
    }
    
    /**
     * Get Date from input user
     * @return Date format
     */
    public String getDate() {
        while (true) {
            System.out.println(Message.INPUT_DATE);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(Message.WRONG_INPUT);
            } else {
                if (!input.matches(Message.MATCHES)) {
                    System.out.println(Message.DATE_WRONG_FORMAT);
                } else {
                    SimpleDateFormat dateFormat = new SimpleDateFormat(Message.DATE_FORMAT);
                    dateFormat.setLenient(false);
                    try {
                        Date currentDate = new Date();
                        Date inputDate = dateFormat.parse(input);
                        currentDate = dateFormat.parse(dateFormat.format(currentDate));
                        if (inputDate.after(currentDate)) {
                            return input;
                        } else {
                            System.out.println(Message.DATE_CONDITIONS);
                        }

                    } catch (Exception e) {
                        System.out.println(Message.DATE_EXIST);
                    }
                }
            }
        }
    }

    public String getRequirementNameInput() {
        String requirementName = getString(Message.REQUIREMENT, Message.WRONG, Message.REGEX_STRING);
        return requirementName;

    }

    public int getTaskTypeInput() {
        int taskType = getInt(Message.TASK_TYPE, Message.WRONG, Message.WRONG, Message.WRONG, Message.MIN_TYPE, Message.MAX_TYPE);
        return taskType;
    }

    public double getFromInput() {
        double from = getDouble(Message.ENTER_FROM, Message.WRONG, Message.WRONG, Message.WRONG, Message.MIN_VALUE, Message.MAX_VALUE);
        return from;

    }

    public double getToInput(double from) {
        double to = getDouble(Message.ENTER_TO, Message.WRONG, Message.WRONG, Message.WRONG, from + Message.GUARDANTEED_VALUE, Message.MAX_DOUBLE_VALUE);
        return to;
    }

    public String getAssigneeInput() {
        String assignee = getString(Message.ENTER_ASSIGNEE, Message.WRONG, Message.REGEX_STRING);
        return assignee;
    }

    public String getReviewerInput() {
        String reviewer = getString(Message.ENTER_REVIEWER, Message.WRONG, Message.REGEX_STRING);
        return reviewer;
    }
}
