package Testing;

public class user {
    private String email;
    private String password;

    // Constructor
    public user(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getters and Setters (Optional for serialization)
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
