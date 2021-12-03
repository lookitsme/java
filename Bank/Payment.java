package Bank;

import java.util.*;  
import java.util.Scanner;  
public  class Payment{
  
    Scanner s = new Scanner(System.in);
     void menu(){
       System.out.println("How would you like to pay ?");
       System.out.println("Paypal : 1 ");
       System.out.println("Debit Card : 2");
       int choice = s.nextInt();
       switch (choice){
         case 1:
         Paypal p = new Paypal();
         p.get_details();
         System.out.println(p);
         break;

         case 2:
         Debit d = new Debit();
         d.get_details();
         System.out.println(d);
         break;

         default:
         System.out.println("You have entered the Wrong Number\n");
         System.out.println("Please enter the Correct Number");
         break; 


       }
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


 