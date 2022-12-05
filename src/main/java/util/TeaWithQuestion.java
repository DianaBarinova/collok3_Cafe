package util;
import java.io.*;

public class TeaWithQuestion extends BeverageWithQuestion {
    @Override
    public void brew() {
        System.out.println("Making tea");
    }
    @Override
    public void addIngredients() {
        System.out.println("Adding lemon");
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
        // get the user's response
        String answer = null;

        System.out.print("Would you like lemon with your tea (yes/no)? ");

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