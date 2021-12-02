package lecture2;

public class if_else_if_demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =18;
		if (age<18) {
System.out.println("Child");

}
		else if (age>= 18 && age<45) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior Citizen");
		}
		int marks = 67;
		if (marks>=85) {
			System.out.println("A");
			}
		else if (marks>=75 && marks<85) {
			System.out.println("B");
		}
		else if (marks>=65 && marks<75) {
			System.out.println("C");
		}
		else if (marks>=55 && marks<65) {
			System.out.println("D");
		}
		else if (marks<55 && marks>=50) {
			System.out.println("Pass");
		}
		else {
		System.out.println("Fail");
}
}
}
	