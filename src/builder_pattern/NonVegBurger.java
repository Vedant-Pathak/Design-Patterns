package builder_pattern;

public class NonVegBurger  extends Burger{
	public String name() {
		return "ChickenBurger";
	}
	public float price() {
		return 90.0f;
	}
}
