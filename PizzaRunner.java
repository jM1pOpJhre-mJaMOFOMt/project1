import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PizzaRunner {
    private static Scanner scanner = new Scanner(System.in);
    // ^ scanner used for prompting user input
    public static void main(String[] args) {
        // ask user about their pizza preferences
        ArrayList<Topping> toppings = new ArrayList<Topping>();
        System.out.println("Would you like bacon on your pizza?");
        if (getBooleanUserInput()) toppings.add(Topping.BACON);
        System.out.println("Would you like pepperoni on your pizza?");
        if (getBooleanUserInput()) toppings.add(Topping.PEPPERONI);
        System.out.println("Would you like mushrooms on your pizza?");
        if (getBooleanUserInput()) toppings.add(Topping.MUSHROOMS);
        System.out.println("What style pizza would you like (NYC, Chicago, etc)?");
        String style = scanner.nextLine();
        Pizza pizza = new Pizza(toppings.toArray(new Topping[toppings.size()]), style);
        makePizza(pizza);
    }
    
    public static void makePizza(Pizza pizza) {
        printWithSlowDots("Preheating oven");
        printWithSlowDots("Rolling dough");
        printWithSlowDots("Applying sauce");
        // if pizza has toppings, print the toppings
        if (pizza.getToppings().length > 0) printWithSlowDots("Putting on toppings: " + Arrays.stream(pizza.getToppings()).map(Topping::getName).collect(Collectors.joining(", ")));
        else System.out.println("No toppings!");
        printWithSlowDots("Baking pizza");
        System.out.println("Pizza Complete! Enjoy!");
    }

    private static void printWithSlowDots(String message) {
        System.out.print(message);
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(350);
            } catch (Exception ignored) {}
            System.out.print(".");
        }
        System.out.println();
    }

    private static boolean getBooleanUserInput() {
        // prompts user for a yes/no input
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y") || input.equals("yes") || input.equals("true")) return true;
            else if (input.equals("n") || input.equals("no") || input.equals("false")) return false;
            else  System.out.println("Invalid input! Please enter yes or no.");
        }
    }
}