
public class Convert {

    // Convert a value in another base to decimal
    public int OtherToDec(String Other, int base) {
        int result = 0;
        String HEX = Message.HEXA;
        Other = Other.toUpperCase();
        for (int i = 0; i < Other.length(); i++) {
            result += HEX.indexOf(Other.charAt(i)) * Math.pow(base, Other.length() - 1 - i);
        }
        return result;
    }

    // Convert a decimal value to another base
    public String DecToOther(int Dec, int base) {
        String result = "";
        String HEX = Message.HEXA;
        while (Dec > 0) {
            result = HEX.charAt(Dec % base) + result;
            Dec /= base;
        }
        return result;
    }
}
