package util;
import java.io.*;

public class CoffeeWithQuestion extends BeverageWithQuestion {
    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }
    @Override
    public void addIngredients() {
        System.out.println("Adding sugar");
    }

    public boolean customerWish() {

        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("yes")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (yes/no)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("input error");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
