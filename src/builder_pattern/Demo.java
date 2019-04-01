package builder_pattern;

public class Demo {
	public static void main(String args[])
	{
		MealBuilder builder = new MealBuilder();
		Meal veg = builder.makeVeg();
		Meal food = builder.makeNonVeg();
		veg.showItems();
		food.showItems();
		System.out.println(veg.getCost());
		System.out.println(food.getCost());
	}
}
