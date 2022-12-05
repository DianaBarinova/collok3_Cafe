package util;
public abstract class Beverage {

    final void prepareDrink() {
        boilWater();
        brew();
        pourInCup();
        addIngredients();
    }

    public abstract void brew();

    public abstract void addIngredients();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
