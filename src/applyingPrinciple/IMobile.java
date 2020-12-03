package applyingPrinciple;

public interface IMobile {
    String User="";
    String Password="";

    public String getUser();
    public void setUser(String user) ;

    public String getPassword();

    public void setPassword(String password) ;
    public boolean fingerPrintAuthentication() throws  Exception;
    public boolean passwordAuhentication();


}
