package singleton_pattern;

public class Demo {
	public static void main(String args[])
	{
		Neo savior = Neo.getNeo();
		System.out.println(savior.name);
	}
}
