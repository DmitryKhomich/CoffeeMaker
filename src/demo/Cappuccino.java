package demo;

public class Cappuccino implements Coffee{
    public Cappuccino(){
        drinkCoffee();
    }
    @Override
    public void drinkCoffee() {
        System.out.println("Your Cappuccino. Enjoy :)");
    }
}
