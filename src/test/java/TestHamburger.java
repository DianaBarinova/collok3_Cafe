import util.Hamburger;

public class TestHamburger extends TestDish<Hamburger> {
    public TestHamburger() {
        super(
                new Hamburger(),
                "Frying buns",
                "Adding ketchup and mustard",
                "Adding cutlet, cheese and tomato"
        );
    }

}