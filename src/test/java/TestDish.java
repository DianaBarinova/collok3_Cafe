
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import util.Beverage;
import util.Dish;

public class TestDish <M extends Dish>{
    private final M method;
    private final String expectedTargetfryingBuns;
    private final String expectedTargetsmearSauce;
    private final String expectedTargetaddIngredients;

    public TestDish(M method, String expectedTargetfryingBuns,final String expectedTargetsmearSauce,
                    final String expectedTargetaddIngredients) {
        this.method = method;
        this.expectedTargetfryingBuns = expectedTargetfryingBuns;
        this.expectedTargetsmearSauce=expectedTargetsmearSauce;
        this.expectedTargetaddIngredients=expectedTargetaddIngredients;
    }
    @Test
    void testBuns() {
        assertEquals(expectedTargetfryingBuns, this.method.fryingBuns());
    }
    @Test
    void TestsmearSauce() {
        assertEquals(expectedTargetsmearSauce, this.method.smearSauce());
    }
    @Test
    void TestaddIngredients() {
        assertEquals(expectedTargetaddIngredients, this.method.addIngredients());
    }

}

