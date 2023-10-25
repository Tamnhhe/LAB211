
package Resource;
/**
 * Class containing various messages used in the program
 * @author Tamnhhe173108
 * Class SE1811
 * Subject J1.S.P0071
 * Version 1.0
 */

public class Message {
    public static final String MENU = "========= Task program =========\n1.	Add Task\n2.	Delete task\n3.	Display Task\n4.	exit";
    public static final String REGEX_STRING = "[a-z A-Z 0-9]+";
    public static final String OPTION = "Option: ";
    public static final String WRONG_INPUT = "Input cannot be empty !!";
    public static final String INPUT_DATE = "Enter date: ";
    public static final String INPUT_ID = "Enter id: ";
    public static final String MATCHES = "\\d{1,2}[-]\\d{1,2}[-]\\d{1,4}";
    public static final String DATE_WRONG_FORMAT = "Date must be is format dd-MM-yyyy";
    public static final String DATE_FORMAT = "dd-MM-yyyy";
    public static final String DATE_CONDITIONS = "Date must be greater or equal ti current date !!";
    public static final String DATE_EXIST = "Date does not exist !!";
    public static final String REQUIREMENT = "Requirement Name: ";
    public static final String WRONG = "Wrong";
    public static final String NOT_FOUND = "NOT FOUND !!";
    public static final String DELETE_FAILED = "DELETE FAILED !!";
    public static final String TASK_TYPE = "Task Type: ";
    public static final String ENTER_TO = "Enter to: ";
    public static final String ENTER_FROM = "Enter from: ";
    public static final String ENTER_ASSIGNEE = "Enter assignee";
    public static final String ENTER_REVIEWER = "Enter reviewer";
    public static final String OVERLAPS = "Overlaps task !!";
    public static final int MIN_TYPE = 1;
    public static final int MAX_TYPE = 4;
    public static final double GUARDANTEED_VALUE = 0.5;
    public static final int MIN_VALUE = 8;
    public static final int MAX_VALUE = 17;
    public static final double MAX_DOUBLE_VALUE = 17.5;
    
}
