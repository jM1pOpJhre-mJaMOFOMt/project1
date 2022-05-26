public class Topping extends Food {
    public Topping(String name, int calories) {
        super(name, calories);
    }

    // preset toppings
    public static final Topping PINEAPPLE = new Topping("Pineapple", 21);
    public static final Topping PEPPERONI = new Topping("Pepperoni", 80);
    public static final Topping SAUSAGE = new Topping("Sausage", 115);
    public static final Topping MUSHROOMS = new Topping("Mushrooms", 11);
    public static final Topping BACON = new Topping("Bacon", 92);
    public static final Topping ONIONS = new Topping("Onions", 11);
    public static final Topping PEPPERS = new Topping("Peppers", 6);
    public static final Topping CHICKEN = new Topping("Chicken", 30);
}
