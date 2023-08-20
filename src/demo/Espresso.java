package demo;

public class Espresso implements Coffee{

    public Espresso(){
        drinkCoffee();
    }
    @Override
    public void drinkCoffee() {
        System.out.println("Your Espresso. Enjoy :)");
    }
}
