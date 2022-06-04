package questions;
class Employee {
	int age;
	String name;
	public void printDetails() {
	System.out.println("My age is "+ age);	
	System.out.println("My name is "+ name);
	}
}

public class Custom_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("This is our custom class");
Employee Harry = new Employee();//Instantiating a new employee object
Employee Khushboo = new Employee();
Harry.age = 28;
Harry.name = "Harry";
Khushboo.age = 22;
Khushboo.name = "Khushi";
Harry.printDetails();
Khushboo.printDetails();
	}
}

 
