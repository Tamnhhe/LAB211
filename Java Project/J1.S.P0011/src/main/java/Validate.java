
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validate {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    // Get a valid base (2, 10, or 16)
    public int getBase(String message, String error) {
        while (true) {
            try {
                System.out.println(message);
                int base = Integer.parseInt(in.readLine());
                if (base == Message.BINARY_BASE || base == Message.DECIMAL_BASE || base == Message.HEXA_BASE) {
                    return base;
                }
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
            System.out.println(error);
        }
    }

    // Get a valid value based on the specified base
    public String getValue(String message, String error, int base) {
        while (true) {
            try {
                System.out.println(message);
                String value = in.readLine();
                switch (base) {
                    case 2:
                        if (value.matches(Message.RANGEBASE_2)) {
                            return value;
                        }
                        break;
                    case 10:
                        if (value.matches(Message.RANGEBASE_10)) {
                            return value;
                        }
                        break;
                    case 16:
                        if (value.matches(Message.RANGEBASE_16)) {
                            return value;
                        }
                        break;
                }
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
            System.out.println(error);
        }
    }
}
