package builder_pattern;

public class MealBuilder {
	public Meal makeVeg() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	public Meal makeNonVeg() {
		Meal meal = new Meal();
		meal.addItem(new NonVegBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
