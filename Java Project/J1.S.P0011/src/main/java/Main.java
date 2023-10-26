
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Validate validate = new Validate();
    static Convert convert = new Convert();

    public static void main(String[] args) {
        while (true) {
            int inBase = getValidBase(Message.INPUT_BASE, Message.INVALID_INPUT_BASE);
            int outBase = getValidBase(Message.OUTPUT_BASE, Message.INVALID_OUTPUT_BASE);
            String value = validate.getValue(Message.INPUT_VALUE, Message.INVALID_VALUE, inBase);

            System.out.print(Message.CONVERSION_RESULT);

            if (inBase == Message.DECIMAL_BASE) {
                System.out.println(convert.DecToOther(Integer.parseInt(value), outBase));
            } else {
                int temp = convert.OtherToDec(value, inBase);
                System.out.println(convert.DecToOther(temp, outBase));
            }

            System.out.println("=============================================");
        }
    }

    public static int getValidBase(String message, String error) {
        int base = -1;
        while (base != Message.BINARY_BASE && base != Message.DECIMAL_BASE && base != Message.HEXA_BASE) {
            try {
                System.out.println(message);
                base = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
        return base;
    }
}
