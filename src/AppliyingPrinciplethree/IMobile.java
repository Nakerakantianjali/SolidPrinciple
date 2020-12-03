package AppliyingPrinciplethree;

public interface IMobile {
    String User="";
    String Password="";

    public String getUser();
    public void setUser(String user) ;

    public String getPassword();

    public void setPassword(String password) ;
    public boolean passwordAuhentication();

}
