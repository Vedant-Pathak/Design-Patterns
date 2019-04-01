package singleton_pattern;

public class Neo {
	String name;
	Neo(String str)
	{
		this.name = str;
	}
	private static Neo instance = new Neo("Mr.Anderson");
	public static Neo getNeo() {
		return instance;
	}
}
