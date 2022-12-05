package util;
public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }
    @Override
    public void addIngredients() {
        System.out.println("Adding sugar");
    }
}
