


public class Account {
    private String username;
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
