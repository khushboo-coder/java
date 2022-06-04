package practice_questions;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int marks = sc.nextInt();
if(marks>90) {
	System.out.println("A+");
}
else if(marks>80) {
	System.out.println("A");
	
}
else if(marks>70) {
	System.out.println("B+");
}
else if(marks>60) {
	System.out.println("B");
}
else if (marks>50) {
	System.out.println("C");
}
else if(marks>40) {
	System.out.println("D");
}
else {
	System.out.println("Fail");
}
	}

}
