package applyingPrinciple;

public class Samsung implements IMobile {
    String user,password;
    @Override
    public String getUser() {
        return user;
    }

    @Override
    public void setUser(String user) {
        this.user=user;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password=password;
    }

    @Override
    public boolean fingerPrintAuthentication() throws Exception {
        if(password=="fingerpint")
            return true;
        return false;
    }

    @Override
    public boolean passwordAuhentication() {
        if(password.equals("password"))
            return true;
        return false;
    }
}
