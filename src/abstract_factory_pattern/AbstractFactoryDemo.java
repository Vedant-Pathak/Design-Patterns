package abstract_factory_pattern;
import java.util.*;
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter yes if polygon");
		String shapetype = sc.nextLine();
		AbstractFactory shapeFactory;
		shapeFactory = new WeirdFactory();
		if("yes".equalsIgnoreCase(shapetype))
			shapeFactory = new PolygonFactory();
		System.out.println("what shape?");
		String res = sc.nextLine();
		//System.out.println(res);
		Shape s = shapeFactory.getShape(res);
		s.draw();
		/*AbstractFactory polygonfact = new PolygonFactory();
		AbstractFactory weirdfact = new WeirdFactory();
		System.out.println("enter shape");
		String shape = sc.nextLine();
		if(shape.equals("rectangle"))
			return */
	}

}
