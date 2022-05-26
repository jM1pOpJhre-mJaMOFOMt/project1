public class Pizza extends Food {
    public Pizza(Topping[] toppings, String style) {
        super("Pizza", 350); // name is pizza and base calories is 350 (DOESNT INCLUDE TOPPINGS)
        this.toppings = toppings;
        this.style = style;
    }

    private Topping[] toppings;
    private String style;

    public Topping[] getToppings() {
        return toppings;
    }

    public String getStyle() {
        return style;
    }

    public int getCaloriesWithToppings() {
        int toppingsCalories = 0;
        for (Topping topping : toppings) {
            toppingsCalories += topping.getCalories(); //adds up the calories of all toppings
        }
        return getCalories() + toppingsCalories;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}