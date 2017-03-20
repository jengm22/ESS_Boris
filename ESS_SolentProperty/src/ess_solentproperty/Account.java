package ess_solentproperty;

/**
 * @author 1leszd34
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

}
