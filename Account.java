public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public String getUsername() {
        return username;
    }
}
