package manager;

public class Message {

    public final String REGEX_USERNAME = "\\d{10}";
    public final String REGEX_PASSWORD = "(?=.*\\d.*)(?=.*[a-zA-Z].*).{8,31}";
    public final String REGEX_CAPTCHA = "[a-zA-Z0-9]+";
    public final String OPTION = "Please choice one option: ";
    public final int MIN_OPTION = 1;
    public final int MAX_OPTION = 3;
}
