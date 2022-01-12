package Static;

public class TestCase1 {
	
	static {
	System.out.println("narender");
	}
	
	static {
		System.out.println("singh");
	}
	
	TestCase1() {
		System.out.println("constructor method");

	}
	{
		System.out.println("init method");
	}
	public static void main(String[] args) {
		System.out.println("main method");
		
		new TestCase1();
	}

}
