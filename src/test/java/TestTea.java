import util.Tea;
public class TestTea extends TestBeverage<Tea>{
    public TestTea() {
        super(
                new Tea(),
                "Making tea",
                "Boiling water",
                "Adding lemon",
                "Pouring into cup"
        );
    }

}
