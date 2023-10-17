/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Scanner;
import Resource.Message;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tamnhhe
 */
public class Unity {

    Scanner scanner = new Scanner(System.in);

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
