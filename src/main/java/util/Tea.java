package util;
public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println( "Making tea");
    }
    @Override
    public void addIngredients() {
        System.out.println("Adding lemon");
    }
}
