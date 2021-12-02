package Bank System;

class Paypal extends Bank{
    String email;
    String password;
    public Paypal(String email, String password){
     
        this.email=email;
        this.password=password;
    }
    public Paypal(){
        
    }
    public void getcredintials(){
        System.out.println(this.email);
        System.out.println(this.password);
    }
}