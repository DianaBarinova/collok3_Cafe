package util;
public abstract class Beverage {

    final void prepareDrink() {
       System.out.println(boilWater());
       System.out.println(brew());
       System.out.println(pourInCup());
       System.out.println(addIngredients());
    }

    public abstract String brew();

    public abstract String addIngredients();

    public String boilWater() {
        return "Boiling water";
    }

    public String pourInCup() {
        return "Pouring into cup";
    }
}
