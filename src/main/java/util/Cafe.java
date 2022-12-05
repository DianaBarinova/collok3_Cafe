package util;

import java.util.Scanner;

public class Cafe {
    enum State {
        COFFE,
        TEA,
        HOTDOG,
        SANDWICH,
        HAMBURGER,
        STOP,
        START,
        BEVERAGES,
        SNACKS
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our cafe!"+'\n'+
                "choose what you want to order");
        State state=State.START;
        while(state!=State.STOP) {
            switch (state) {
                case START:
                    System.out.println("Beverages-1" + '\n'
                            + "Snacks-2");
                    int command1 = sc.nextInt();
                    if (command1 == 1) {
                        state = State.BEVERAGES;
                    } else {
                        state = State.SNACKS;
                    }
                    break;

                case BEVERAGES:
                    System.out.println("Tea-1" + '\n' + "Coffe-2");
                    int command2 = sc.nextInt();
                    if (command2 == 1) {
                        state = State.TEA;
                    } else {
                        state = State.COFFE;
                    }
                    break;
                case SNACKS:
                    System.out.println("Hot Dog-1" + '\n' + "Hamburger-2" + '\n' + "Sandwich-3");
                    int command3 = sc.nextInt();
                    if (command3 == 1) {
                        state = State.HOTDOG;
                    } else if (command3 == 2) {
                        state = State.HAMBURGER;
                    } else {
                        state = State.SANDWICH;
                    }
                    break;
                case TEA:
                    TeaWithQuestion tea = new TeaWithQuestion();
                    System.out.println("Making tea...");
                    tea.prepareDrink();
                    System.out.println('\n');
                    System.out.println("Would you like anything else?" + '\n'
                            + "YES-1" + '\n' + "NO-2" + '\n');
                    int command4 = sc.nextInt();
                    if (command4 == 1) {
                        state = State.START;
                    } else {
                        System.out.println("Bye-bye");
                        state = State.STOP;
                    }
                    break;
                case COFFE:
                    CoffeeWithQuestion coffee = new CoffeeWithQuestion();
                    System.out.println("Making coffee...");
                    coffee.prepareDrink();
                    System.out.println('\n');
                    System.out.println("Would you like anything else?" + '\n'
                            + "YES-1" + '\n' + "NO-2" + '\n');
                    int command5 = sc.nextInt();
                    if (command5 == 1) {
                        state = State.START;
                    } else {
                        System.out.println("Bye-bye");
                        state = State.STOP;
                    }
                    break;
                case SANDWICH:
                    Sandwich sandwich = new Sandwich();
                    System.out.println("Making sandwich...");
                    sandwich.prepareSnack();
                    System.out.println('\n');
                    System.out.println("Would you like anything else?" + '\n'
                            + "YES-1" + '\n' + "NO-2" + '\n');
                    int command6 = sc.nextInt();
                    if (command6 == 1) {
                        state = State.START;
                    } else {
                        System.out.println("Bye-bye");
                        state = State.STOP;
                    }
                    break;
                case HOTDOG:
                    HotDog hotDog = new HotDog();
                    System.out.println("Making hot dog...");
                    hotDog.prepareSnack();
                    System.out.println('\n');
                    System.out.println("Would you like anything else?" + '\n'
                            + "YES-1" + '\n' + "NO-2" + '\n');
                    int command7 = sc.nextInt();
                    if (command7 == 1) {
                        state = State.START;
                    } else {
                        System.out.println("Bye-bye");
                        state = State.STOP;
                    }
                    break;
                case HAMBURGER:
                    Hamburger hamburger = new Hamburger();
                    System.out.println("Making hamburger...");
                    hamburger.prepareSnack();
                    System.out.println('\n');
                    System.out.println("Would you like anything else?" + '\n'
                            + "YES-1" + '\n' + "NO-2" + '\n');
                    int command8 = sc.nextInt();
                    if (command8 == 1) {
                        state = State.START;
                    } else {
                        System.out.println("Bye-bye");
                        state = State.STOP;
                    }
                    break;
                case STOP:
                    break;
                default:

            }
        }
    }
}