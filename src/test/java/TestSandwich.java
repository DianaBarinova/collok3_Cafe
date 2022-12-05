import util.Sandwich;

public class TestSandwich extends TestDish<Sandwich> {
    public TestSandwich() {
        super(
                new Sandwich(),
                "Frying buns",
                "Adding ketchup and mayonnaise",
                "Adding  salami and cheese"
        );
    }

}
