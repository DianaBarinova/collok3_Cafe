import util.Coffee;
public class TestCofee extends TestBeverage<Coffee>{
    public TestCofee() {
        super(
                new Coffee(),
                "Brewing coffee",
                "Boiling water",
                "Adding sugar",
                "Pouring into cup"
        );
    }

}
