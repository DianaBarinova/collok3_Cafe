package util;

public abstract class Dish {
    final void prepareSnack() {
       System.out.println( fryingBuns());
        System.out.println(smearSauce());
        System.out.println(addIngredients());
    }

   public abstract String addIngredients();
    public abstract String smearSauce();

    public String fryingBuns() {
        return "Frying buns";
    }
}
