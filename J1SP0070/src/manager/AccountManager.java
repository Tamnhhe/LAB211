
package manager;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;
import model.Account;
import GUI.Unity;

/**
 * Class: AccountManager
 * Author: Tamnhhe173108
 * Subject: J.S.P0070
 * 
 * The AccountManager class handles user account data and login functionality.
 */
public class AccountManager {
    // List to store user accounts
    ArrayList<Account> accountList = new ArrayList<>();
    
    // Message object for error messages
    Message message = new Message();
    
    // Unity object for user input handling
    Unity unity = new Unity();
    
    /**
     * Initializes some sample user accounts.
     */
    public void UsersData(){
        accountList.add(new Account("2283862588", "huytam258"));
        accountList.add(new Account("9890125888", "huytam2106"));
        accountList.add(new Account("1049817261", "chdi129YIUQWIE"));
        accountList.add(new Account("1059817261", "dhdi129YIUQWIE"));
    }

    /**
     * Logs in the user with a Vietnamese locale.
     */
    public void loginVietnamese() {
        Locale localeVi = new Locale("vi");
        loginFunction(localeVi);
    }

    /**
     * Logs in the user with an English locale.
     */
    public void loginEnglish() {
        Locale localeEn = new Locale("en");
        loginFunction(localeEn);
    }

    /**
     * Handles the login process.
     * 
     * @param locale The locale for language selection.
     */
    public void loginFunction(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("language/message", locale);
        
        String username = unity.getString(bundle.getString("messageUsername"), bundle.getString("messageUsernameError"), message.REGEX_USERNAME);
        String password = unity.getString(bundle.getString("messagePassword"), bundle.getString("meassagePasswordError"), message.REGEX_PASSWORD);
        handleCaptcha(bundle.getString("meassageCaptcha"), bundle.getString("meassageCaptchaInput"), bundle.getString("meassageCaptchaError"));
        if(!checkAccount(username, password)){
            System.out.println(bundle.getString("meassageAccountError"));
        }else{
            System.out.println(bundle.getString("meassageSuccessfully"));
        }
    }

    /**
     * Handles the captcha validation process.
     * 
     * @param messageCaptcha The message prompt for the captcha.
     * @param msgInput The message prompt for user input.
     * @param error The error message for invalid input.
     */
    public void handleCaptcha(String messageCaptcha, String msgInput, String error) {
        String generateCaptcha = generateCaptcha();
        System.out.println(messageCaptcha + generateCaptcha);
        while(true){
            String inputCaptcha = unity.getString(msgInput, "Captcha must be alphanumeric", message.REGEX_CAPTCHA);
            if(!generateCaptcha.contains(inputCaptcha)){
                System.out.println(error);
            }else{
                break;
            }
        }
    }

    /**
     * Generates a random alphanumeric captcha.
     * 
     * @return The generated captcha.
     */
    public String generateCaptcha() {
        String captcha = "";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                         + "abcdefghijklmnopqrstuvwxyz" 
                         + "0123456789";

        Random random = new Random();
        
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(characters.length());
            captcha += characters.charAt(index);
        }

        return captcha;
    }
    
    /**
     * Checks if the provided username and password match any existing accounts.
     * 
     * @param username The username entered by the user.
     * @param password The password entered by the user.
     * @return True if there is a matching account, false otherwise.
     */
    public boolean checkAccount(String username, String password){
        for(Account account: accountList){
            if(account.getUsername().equals(username) && account.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}
