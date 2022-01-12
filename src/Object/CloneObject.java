package Object;

public class CloneObject implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
      
		return super.clone();
	}

	String str = "New Object Created";

	public static void main(String[] args) {

		CloneObject obj1 = new CloneObject();
		try {

			CloneObject obj2 = (CloneObject) obj1.clone();
			System.out.println(obj2.str);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
