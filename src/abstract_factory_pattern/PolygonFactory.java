package abstract_factory_pattern;

public class PolygonFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		if(shape.equalsIgnoreCase("square"))
			return new Square();
		return new Rectangle();
	}

}
