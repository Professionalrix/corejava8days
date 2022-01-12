package Static;


class EmployeeInfo{
	int empId;
	String empName;
	static String designation= "Frontend Developer";
	
	public EmployeeInfo(int id, String name) {
	this.empId= id;
	this.empName= name;
	}

	void display() {
		System.out.println(empId+" "+empName+" "+designation);
	}
}



public class Employee {

	public static void main(String[] args) {
		EmployeeInfo e1 = new EmployeeInfo(111,"Narender Singh");
		EmployeeInfo e2 = new EmployeeInfo(112,"Chetan Kochar");
		e1.display();
		e2.display();
		

	}

}
