package util;
public class Coffee extends Beverage {
    @Override
    public String brew() {
        return "Brewing coffee";
    }
    @Override
    public String addIngredients() {
        return "Adding sugar";
    }
}
