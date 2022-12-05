package util;

public abstract class Dish {
    final void prepareSnack() {
        fryingBuns();
        smearSauce();
        addIngredients();
    }

   abstract void addIngredients();
    abstract void smearSauce();

    private void fryingBuns() {
        System.out.println("Frying buns");
    }
}
