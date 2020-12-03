package com.company;

public class Mobile {
    String User;
    String Password;

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean passwordAuthentication(){

        int passwordType=0;
        final int Nokia=1;
       final  int Samsung=2;
        System.out.println("enter type of password");
        switch(passwordType){
            case Nokia:
                System.out.println("check password");
                //if password is
                return true;
            case Samsung:
                System.out.println("check password using fingerPrint");
                return true;

        }
        return false;
    }
    public void sendMessage(){
        if(passwordAuthentication()==true){
            System.out.println("msg");
        }
    }

}
