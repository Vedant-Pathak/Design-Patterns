package abstract_factory_pattern;

public class WeirdFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape.equals("circle"))
			return new Circle();
		return new Line();
	}

}
