
package Pizza;
import java.util.*;
import java.io.*;

class Order {
    ArrayList<Pizza> pizzas;
    int n_standard_pizzas;
    int n_deluxe_pizzas;

    public void add_pizzas() {

        this.pizzas = new ArrayList<Pizza>();

        boolean loop_add_pizzas = true;

        while (loop_add_pizzas) {

            System.out.println("Enter the type of pizza. \n1. Standard \n2.Deluxe\n > ");
            char type = 0;
            try {
                type = (char) System.in.read();
            } catch (IOException e) {

            }

            Pizza pizza = new Pizza();
            if (type == 1) {
                pizza.set_type(Pizza.STANDARD_PIZZA);
                this.n_standard_pizzas++;
            } else {
                pizza.set_type(Pizza.DELUXE_PIZZA);
                this.n_deluxe_pizzas++;
            }

            if (pizza.get_type() == Pizza.DELUXE_PIZZA) {
                char topping = 'n';
                System.out.println("Do you want topping 1? (y/n) > ");
                try {
                    topping = (char) System.in.read();
                } catch (IOException e) {
                }
                if (topping == 'y') {
                    pizza.add_topping_1();
                }

                System.out.println("Do you want topping 2? (y/n) > ");
                try {
                    topping = (char) System.in.read();
                } catch (IOException e) {
                }
                if (topping == 'y') {
                    pizza.add_topping_2();
                }

                System.out.println("Do you want topping 3? (y/n) > ");
                try {
                    topping = (char) System.in.read();
                } catch (IOException e) {
                }
                if (topping == 'y') {
                    pizza.add_topping_3();
                }
            }

            System.out.println("Do you want to add another pizza? (Y/n) > ");
            char add_pizza = 'n';
            try {
                add_pizza = (char) System.in.read();
            } catch (IOException e) {
            }
            if (add_pizza != 'y') {
                loop_add_pizzas = false;
            }
            pizzas.add(pizza);
        }
    }

    public static void main(String[] args) {
        Order pizza_order = new Order();
        pizza_order.add_pizzas();
    }

}