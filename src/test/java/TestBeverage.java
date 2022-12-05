import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.Beverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBeverage <M extends Beverage>{

    private final M method;
    private final String expectedTarget;


    private final String expectedTargetResult;


    private final String expectedConfuseMethod;

    private final String expectedStealMethod;
    public TestBeverage( final M method, String expectedTarget, final String expectedTargetResult,
                              final String expectedConfuseMethod, final String expectedStealMethod) {

this.method=method;
        this.expectedTarget = expectedTarget;
        this.expectedTargetResult = expectedTargetResult;
        this.expectedConfuseMethod = expectedConfuseMethod;
        this.expectedStealMethod = expectedStealMethod;
    }
   @Test
    void testBrew() {
        assertEquals(expectedTarget, this.method.brew());
    }
    @Test
    void testAddIngredients() {
        assertEquals(expectedTarget, this.method.addIngredients());
    }
    @Test
    void TestBoilWater() {
        assertEquals(expectedTarget, this.method.boilWater());
    }


}
