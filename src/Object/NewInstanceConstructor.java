package Object;

import java.lang.reflect.Constructor;

public class NewInstanceConstructor {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		try {
			Constructor<NewInstanceConstructor> constructor = NewInstanceConstructor.class.getDeclaredConstructor();
			NewInstanceConstructor r = constructor.newInstance();
			r.setName("Narender Singh");
			System.out.println(r.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
