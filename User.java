/**
 * Abstract base class for all users of the system.
 * Customer and Admin both extend this class.
 */
public abstract class User {
    private String userId;
    private String userName;
    private String userPassword;
    private String userRegisterTime;
    private String userRole;

    /**
     * Constructs a user object.
     * @param userId Unique id, format u_ followed by 10 digits
     * @param userName The user's name
     * @param userPassword The user's (encrypted) password
     * @param userRegisterTime Format: DD-MM-YYYY_HH:MM:SS
     * @param userRole "customer" or "admin"
     */
    public User(String userId, String userName, String userPassword,
                String userRegisterTime, String userRole) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userRegisterTime = userRegisterTime;
        this.userRole = userRole;
    }

    /** Default constructor with default values. */
    public User() {
        this("u_0000000000", "", "", "00-00-0000_00:00:00", "customer");
    }

    /** @return the user id */
    public String getUserId() {
        return userId;
    }

    /** @return the user name */
    public String getUserName() {
        return userName;
    }

    /** @return the (encrypted) password */
    public String getUserPassword() {
        return userPassword;
    }

    /** @return the registration time */
    public String getUserRegisterTime() {
        return userRegisterTime;
    }

    /** @return the role, "customer" or "admin" */
    public String getUserRole() {
        return userRole;
    }

    /** @param userName the new user name */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /** @param userPassword the new (encrypted) password */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * Returns the user information as a JSON-like string.
     * @return formatted string
     */
    @Override
    public String toString() {
        return "{\"user_id\":\"" + userId + "\", "
                + "\"user_name\":\"" + userName + "\", "
                + "\"user_password\":\"" + userPassword + "\", "
                + "\"user_register_time\":\"" + userRegisterTime + "\", "
                + "\"user_role\":\"" + userRole + "\"}";
    }
}
