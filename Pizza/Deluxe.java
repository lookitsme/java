package Pizza;

public class Deluxe {
    int price=200; 
    private int pizza_count;
    private String extra_toppings;
    private float total_amount;
    public Deluxe (){
        pizza_count= 0 ;
        extra_toppings="";
        total_amount=0;
    }
    public Deluxe(int pizza_count, String extra_toppings,float total_amount){
        this.pizza_count=pizza_count;
        this.extra_toppings=extra_toppings;
        this.total_amount=total_amount;
    }
    public void order_Amount(int pizza_count){
        pizza_count = pizza_count;
    }
    public void extra_toppings(String extra_toppings){
        extra_toppings=extra_toppings;
    }
    public void order_Amount(float total_amount){
        total_amount=total_amount;
    }
    public int getpizza_count()
    {
        return pizza_count;
    }
    public String getextra_toppings()
    {
        return extra_toppings;
    }
    public float gettotal_amount()
    {
        return total_amount;
    }
    
}
