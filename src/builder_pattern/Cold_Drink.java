package builder_pattern;

public abstract class Cold_Drink implements Item{
	public Packing packing() {
		return new Bottle();
	}
}
