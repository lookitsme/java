package Pizza;
import java.util.*;

class Order {
    ArrayList<Pizza> pizzas;
    int n_standard_pizzas;
    int n_deluxe_pizzas;
    Scanner scanner;

    int read_int ()
    {
        int ret = -1;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                ret = scanner.nextInt();
                break;
            } else {
                scanner.next();
            }
        }
        return ret;
    }

    Pizza get_free_pizza(int pizza_type) {
        Pizza ret = new Pizza();
        System.out.print("You get a free ");
        if (pizza_type == Pizza.DELUXE_PIZZA) {
            System.out.print("deluxe ");
        } else {
            System.out.print("standard ");
        }
        System.out.println("Pizza!");
        ret.set_type(pizza_type);
        ret.set_pizza_free();
        if (pizza_type == Pizza.DELUXE_PIZZA) {
            int topping = 0;
            System.out.println("Do you want topping 1? (1/0) > ");
            topping = read_int();
            if (topping == 1) {
                ret.add_topping_1();
            }

            System.out.println("Do you want topping 2? (1/0) > ");
            topping = read_int();
            if (topping == 1) {
                ret.add_topping_2();
            }

            System.out.println("Do you want topping 3? (1/0) > ");
            topping = read_int();
            if (topping == 1) {
                ret.add_topping_3();
            }
        }
        return ret;
    }

    public void add_pizzas() {

        this.scanner = new Scanner(System.in);
        this.pizzas = new ArrayList<Pizza>();

        boolean loop_add_pizzas = true;

        while (loop_add_pizzas) {

            System.out.println("Enter the type of pizza. \n1. Standard \n2.Deluxe\n > ");
            int type = 0;
            type = read_int();

            Pizza pizza = new Pizza();
            if ( type == 1) {
                pizza.set_type(Pizza.STANDARD_PIZZA);
                this.n_standard_pizzas++ ;
            } else {
                pizza.set_type(Pizza.DELUXE_PIZZA);
                this.n_deluxe_pizzas++ ;
            }


            if (pizza.get_type() == Pizza.DELUXE_PIZZA) {
                int topping = 0;
                System.out.println("Do you want topping 1? (1/0) > ");
                topping = read_int();
                if (topping == 1) {
                    pizza.add_topping_1();
                }

                System.out.println("Do you want topping 2? (1/0) > ");
                topping = read_int();
                if (topping == 1) {
                    pizza.add_topping_2();
                }

                System.out.println("Do you want topping 3? (1/0) > ");
                topping = read_int();
                if (topping == 1) {
                    pizza.add_topping_3();
                }
            }

            if (this.n_standard_pizzas > 0 && this.n_standard_pizzas%5 == 0) {
                Pizza free_pizza = get_free_pizza(Pizza.STANDARD_PIZZA);
                pizzas.add(free_pizza);
            } else if (this.n_deluxe_pizzas > 0 && this.n_deluxe_pizzas%5 == 0) {
                Pizza free_pizza = get_free_pizza(Pizza.DELUXE_PIZZA);
                pizzas.add(free_pizza);
            }

            System.out.println("Do you want to add another pizza? (1/0) > ");
            int add_pizza = 0;
            add_pizza = read_int();
            if (add_pizza != 1) {
                loop_add_pizzas = false;
            }
            pizzas.add(pizza);
        }
    }

    int get_price() {
        int ret = 0;
        for (Pizza pizza : this.pizzas) {
            ret += pizza.calculate_price();
        }
        return ret;
    }

    public static void main(String []args) {
        Order pizza_order = new Order();
        pizza_order.add_pizzas();
        int price = pizza_order.get_price();
        
        System.out.println("The total price is "+price+".");
    }

}