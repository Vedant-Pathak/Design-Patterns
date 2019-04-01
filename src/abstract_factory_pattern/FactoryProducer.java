package abstract_factory_pattern;

public class FactoryProducer {
	public AbstractFactory getFactory(boolean isPolygon)
	{
		if(isPolygon)
			return new PolygonFactory();
		return new WeirdFactory();
	}
}
