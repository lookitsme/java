package Bank System;

import java.util.*;  
public  class Payment{
    float amount; 
    String email;
    String password;
    String card_number;
    int ccv;
    String AccountName;

     public Payment(float amount){
      this.amount=amount;
    
    }
    public void pay_through_paypal(String email, String password){
        this.email=email;
        this.password=password;
    }
    public void pay_through_card(String c, int ccv, String AN){
      this.card_number=c;
      this.ccv=ccv;
      this.AccountName=AN;
    }
    
    }


 