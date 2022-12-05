package util;
public class Tea extends Beverage {
    @Override
    public String brew() {
        return "Making tea";
    }
    @Override
    public String addIngredients() {
        return "Adding lemon";
    }
}
