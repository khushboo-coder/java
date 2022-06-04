package questions;

public class Person {
 String name = "Khushu";
private int age = 22;

//constructor
public Person() {
	
}

public int getAge() {
	
	return age;
}

public void setAge(int age) throws Exception {
	try {
	if(age<0)  {
		
		
	
		throw new Exception("Age can't be a negative number");
	}
	
this.age = age;
	}
	catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	finally {
		System.out.println("Exception generate ho ya na ho, finally always chalta hai and yeh only try-catch ke sath use kiya jata hai");
	}

}


}
