package mate.academy.service;

public class AuthenticationService {
    private String validEmailFirst = "bob@i.ua";
    private String validEmailSecond = "alice@i.ua";
    private String validPasswordFirst = "1234";

    public String getValidEmailFirst() {
        return validEmailFirst;
    }
    public String getValidEmailSecond() {
        return validEmailSecond;
    }
    public String getValidPasswordFirst() {
        return validPasswordFirst;
    }
    /**
     * Imagine that some user wants to login to your site.
     * You should check if user credentials (login and password) are valid or not.
     * All users are stored in <code>UserService</code> class.
     *
     * @param email    - user's email
     * @param password - user's password
     * @return true if user by email exists and passed password is equal to user's password.
     * Return false in any other cases.
     */
    public boolean login(String email, String password) {
        if (email.equals(validEmailFirst) && password.equals(validPasswordFirst)) {
            return true;
        }
        if (email.equals(validEmailSecond) && password.equals(validPasswordFirst)) {
            return true;
        }
        return false;
    }
}
