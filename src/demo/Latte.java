package demo;

public class Latte implements Coffee{

    public Latte(){
        drinkCoffee();
    }
    @Override
    public void drinkCoffee() {
        System.out.println("Your Latte. Enjoy :)");
    }
}
