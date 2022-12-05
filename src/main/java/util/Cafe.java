package util;
public class Cafe {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareDrink();
        System.out.println('\n');

        System.out.println("Making coffee...");
        coffee.prepareDrink();
        System.out.println('\n');

        TeaWithQuestion teaHook = new TeaWithQuestion();
        CoffeeWithQuestion coffeeHook = new CoffeeWithQuestion();

        System.out.println("Making tea...");
        teaHook.prepareDrink();
        System.out.println('\n');

        System.out.println("Making coffee...");
        coffeeHook.prepareDrink();
        System.out.println('\n');

        Sandwich sandwich = new Sandwich();
        System.out.println("Making sandwich...");
        sandwich.prepareSnack();
        System.out.println('\n');

        Hamburger hamburger = new Hamburger();
        System.out.println("Making hamburger...");
        sandwich.prepareSnack();
        System.out.println('\n');

        HotDog hotDog = new HotDog();
        System.out.println("Making hot dog...");
        sandwich.prepareSnack();
        System.out.println('\n');
    }
}