package questions;

public class Khushi {
int age;
String name;
boolean single;

//constructor
public Khushi() {
	this.name = "Khushboo";
	this.age = 22;
	this.single = true;
}

//parametrised constructor
public Khushi(String name, int age, boolean single) {
	this.name = name;
	this.age = age;
	this.single = single;
}

public void introYourself(){
	System.out.println("My name is "+name+" and my age is "+age);
}
public void say(String name) {
	System.out.println(this.name + " say hey "+ name);
}
}
