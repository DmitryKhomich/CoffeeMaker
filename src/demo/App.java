package demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static Customer customer;
    public static BufferedReader reader;

    static {
        customer = new Customer();
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose a drink:\n" +
                "      1 - Espresso\n" +
                "      2 - Cappuccino\n" +
                "      3 - Latte");
    }

    public static void main(String[] args) {
        prepearCoffee();
    }

    public static void prepearCoffee(){
        try{
            int choose  = Integer.parseInt(reader.readLine());
            switch (choose){
                case 1 -> customer.setCoffee(new Espresso());
                case 2 -> customer.setCoffee(new Cappuccino());
                case 3 -> customer.setCoffee(new Latte());
                default -> System.out.println("You entered wrong number or NOT a number, try again");
            }

        } catch (IOException | NumberFormatException e){
            System.out.println("You entered wrong number or NOT a number, try again");
        }
    }
}
