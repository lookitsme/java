package Bank System;

class Paypal extends Bank{
    String email;
    String password;
    public Paypal(String email, String password){
        super(amount);
        this.email=email;
        this.password=password;
    }
    public Paypal(){
        this("able2058@gmail.com","123456");
    }
    public void getcredintials(){
        System.out.println(this.email);
        System.out.println(this.password);
    }
}