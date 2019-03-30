
public class Bkc {
	public static void main(String args[])
	{
		Shape s = new Circle(4);
		s.draw();
		//System.out.println(s.radius);
	}

}
interface Shape{
	void draw();
	int radius = 0;
}
class Circle implements Shape{
	int radius;
	public void draw()
	{
		System.out.println("suck my G-Unit");
	}
	Circle(int value)
	{
		radius = value;
	}
}