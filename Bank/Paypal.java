package Bank;
import java.util.*;  
import java.util.Scanner;
public class Paypal extends Payment{
    Scanner s = new Scanner(System.in);
    private String email;
    private String password;
    private float balance;
    private float total_amount;

    void get_details()
    {
        System.out.println("Enter your email ");
        this.email=s.nextLine();
        System.out.println("Password");
        this.password=s.nextLine();
        System.out.println("Enter amount ");
        this.total_amount=s.nextFloat();
    }
    void calculate(){
        this.balance -=total_amount;
    }
    public String toString(){
        calculate();
        return("Amount Billed :" + this.total_amount+ "\n Remaining Balance " + this.balance );
    }
}
