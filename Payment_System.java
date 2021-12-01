/* Code incomplete 

public abstract class Payment_System {
    float bill_amount;
        public Payment_System(float b){
            this.bill_amount=b;
        }
        public abstract void get_details();
    }
    public class DebitCard extends Payment_System{
        String card_number;
        int ccv;
        String bank_name;
            public DebitCard(String cn, int ccv, String bn){
                    this.card_number=cn;
                    this.ccv=ccv;
                    this.bank_name=bn;
            }
        public void getDetails(){
            System.out.println("Card Number : " + card_number);
            System.out.println("ccv Number : " + ccv);
            System.out.println("Bank Name : " + bank_name);
    
        }
    }
    
public class Paypal extends Payment_System{
    String email;
    String password;
    public Paypal(String email, String password){
        this.email=email;
        this.password=password;
    }
    public void getDetails(){
        System.out.println("Email Address : " + email);
        System.out.println("Password : " + password);
    }
    public static void main(String [] args){
        Payment_System S = new Payment_System(20000);
        DebitCard D = new DebitCard("2222 5341 3241", 123, "Siddartha Bank Limited");
        Paypal P = new Paypal("able@gmail.com", "Hello_world");
        System.out.print(S);

    }
}*/