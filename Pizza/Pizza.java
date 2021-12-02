package Pizza; 

class Pizza {
    public static final int DELUXE_PIZZA = 0;
    public static final int STANDARD_PIZZA = 1;

    int pizza_type;
    boolean has_topping_1 = false;
    boolean has_topping_2 = false;
    boolean has_topping_3 = false;
    boolean is_free_pizza = false;

    public int calculate_price() {
        int price = 100;
        if (pizza_type == DELUXE_PIZZA) {
            price += 100;
        }

        if (this.is_free_pizza) {
            price = 0;
        }

        if (has_topping_1) {
            price += 20;
        }

        if (has_topping_2) {
            price += 20;
        }

        if (has_topping_3) {
            price += 20;
        }
        return price;
    }

    public Pizza() {}

    public int get_type() {
        return this.pizza_type;
    }

    public void set_pizza_free() {
        this.is_free_pizza = true;
    }

    public void set_type(int p_type) {
        this.pizza_type = p_type;
    }

    public Pizza(int p_type) {
        this.pizza_type = p_type;
    }

    public void add_topping_1() {
        this.has_topping_1 = true;
    }

    public void add_topping_2() {
        this.has_topping_2 = true;
    }

    public void add_topping_3() {
        this.has_topping_3 = true;
    }
}