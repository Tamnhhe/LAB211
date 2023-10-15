
/**
 *
 * @author Tamnhhe
 */
class Message {
    private Message(){
        
    }
    public static String format(String message, Object... args){
        return String.format(message,args);
    }
    public static final String CALCULATOR_PROGRAM = "=======Calculator program======\n1. Addition Matrix\n2. Subtraction Matrix\n3. Multiplication Matrix\n4. Quit";
    public static final String CHOICE = "Your choice: ";
    public static final String ADDITION = "-------Addition-------";
    public static final String SUBTRACTION = "-------Subtraction-------";
    public static final String MULTIPLICATION = "-------Multiplication-------";
    public static final String RESULT = "-------Result-------";
    public static final String EQUAL = "=";
    public static final String ERROR_CHOICE = "Error. Enter (1-4)";
    public static final String INVALID_INPUT = "Invalid";
    public static final String ENTER_ROW_MATRIX = "Enter row matrix %d: ";
    public static final String ENTER_COLUMN_MATRIX = "Enter column matrix %d:";
    public static final String ERROR_ROW_MATRIX = "Row matrix must be >0";
    public static final String ERROR_COLUMN_MATRIX = "Column matrix must be >0";
    public static final String ENTER_MATRIX_ELEMENT = "Enter matrix %d[%d][%d]: ";
    public static final String ERROR_RANGE = "Error range";
    public static final String ERROR_INVALID_NUMBER = "Value of matrix is digit";
    public static final String ROW_NOT_MATCH = "Second row of matrix must be equal row Matrix 1\n";
    public static final String COLUMN_NOT_MATCH = "Second column of matrix must be equal column Matrix 1\n";
    public static final String COLUMN_SHOULD_BE_POSITIVE = "Column matrix must be > 0";
    
}
