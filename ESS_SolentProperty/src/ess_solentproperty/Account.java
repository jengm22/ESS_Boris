package ess_solentproperty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dean Leszman - 1LESZD34
 */
class Account {
    private String username;
    private String password;
    private boolean isAdmin;
    
    public Account() {
        username = "username";
        password = "password";
        isAdmin = false;
    }
    
    public Account(String u, String p) {
        username = u;
        password = p;
        isAdmin = false;
    }
    
    public Account(String u, String p, boolean a) {
        username = u;
        password = p;
        isAdmin = a;
    }
    
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean isAdmin() { return isAdmin; }
    
    public void setUsername(String u) { username = u; }
    public void setPassword(String p) { password = p; }
    public void setAdminStatus(boolean a) { isAdmin = a; }

    public boolean isValid(String type, String value) {
        if (type.equals("Username")) {
            Pattern p = Pattern.compile("[a-zA-Z]+"); // Alphabetical
            Matcher m = p.matcher(value);
            return m.matches();
        } else if (type.equals("Password")) {
            Pattern p = Pattern.compile(".+"); // Any character except newline
            Matcher m = p.matcher(value);
            return m.matches();
        }
        return false;
    }
}
