import org.junit.jupiter.api.Test;
import util.Beverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBeverage <M extends Beverage>{

    private final M method;
    private final String expectedTargetBrew;

    private final String expectedTargetBoil;
    private final String  expectedTargetIngredients;
    private final String  expectedTargetpourInCup;

    public TestBeverage( final M method, String expectedTarget,String expectedTargetBoil,
                         final String  expectedTargetIngredients,final String  expectedTargetpourInCup) {

        this.method=method;
        this.expectedTargetBrew = expectedTarget;
        this.expectedTargetBoil=expectedTargetBoil;
        this.expectedTargetIngredients=expectedTargetIngredients;
        this.expectedTargetpourInCup=expectedTargetpourInCup;

    }
   @Test
    void testBrew() {
        assertEquals(expectedTargetBrew, this.method.brew());
    }

    @Test
    void testboilWater() {
        assertEquals(expectedTargetBoil, this.method.boilWater());
    }

    @Test
    void testIngredients()
    {
        assertEquals(expectedTargetIngredients, this.method.addIngredients());
    }
    @Test
    void testCup()
    {
        assertEquals(expectedTargetpourInCup, this.method.pourInCup());
    }


}
