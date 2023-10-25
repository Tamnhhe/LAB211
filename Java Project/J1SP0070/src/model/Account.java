package model;

/**
 * The Account class represents a user account with a username and password.
 */
public class Account {

    /**
     * The username associated with the account.
     */
    private String username;

    /**
     * The password associated with the account.
     */
    private String password;

    /**
     * Default constructor for the Account class.
     */
    public Account() {
    }

    /**
     * Constructor for the Account class that initializes both username and
     * password.
     *
     * @param username The username for the account.
     * @param password The password for the account.
     */
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
