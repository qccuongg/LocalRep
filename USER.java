// User.java
public class USER {
    private String userID;
    private String password;
    private String email;
    private String userType;

    // Constructor
    public USER(String userID, String password, String email, String userType) {
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.userType = userType;
    }

    // Reset password method
    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password has been reset.");
    }

    // Getters and setters
    public String getUserID() { return userID; }
    public String getEmail() { return email; }
    public String getUserType() { return userType; }
    public void setEmail(String email) { this.email = email; }
    public void setUserType(String userType) { this.userType = userType; }
}
