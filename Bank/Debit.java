package Bank;

import java.util.*;  
import java.util.Scanner;  
public class Debit extends Payment{
    
        Scanner s = new Scanner(System.in);
        String bank_name;
        float balance;
        float card_number;
        float total_amount;
        int ccv;
    
    
        void get_details()
        {
            System.out.println("Enter your Bank Name ");
            this.bank_name= s.nextLine();
            System.out.println("Card Number");
            this.card_number= s.nextInt();
            System.out.println("ccv");
            this.ccv= s.nextInt();
            System.out.println("Enter amount ");
            this.total_amount= s.nextFloat();
        }
        void calculate(){
            this.balance -=total_amount;
        }
        public String toString(){
            calculate();
            return("Amount Billed :" + this.total_amount+ "\n Remaining Balance " + this.balance );
        }
    }
    

