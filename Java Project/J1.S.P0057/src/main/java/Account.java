
/**
 * Class: Account
 * Author: Tamnhhe173108
 * Subject: J1.S.P0057
 *
 * The Account class represents a user account with a username and password.
 */
public class Account {

    /**
     * The username for the account.
     */
    private String username;

    /**
     * The password for the account.
     */
    private String password;

    public Account() {
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return password;
    }

    public void setPass(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username + password;
    }

}
