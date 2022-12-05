package util;

public abstract class BeverageWithQuestion {

    final void prepareDrink() {
        boilWater();
        brew();
        pourInCup();
        if (customerWish()) {
            addIngredients();
        }
    }

    abstract void brew();

    abstract void addIngredients();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWish() {
        return true;
    }
}
