package practice_questions;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number");
int a = sc.nextInt();
System.out.println("Enter 2nd number");

int b = sc.nextInt();
System.out.println("Enter 3rd number");

int c = sc.nextInt();
if(a>b && a>c) {
	System.out.println(a);
}
else if(b>c  && b>a) {
	System.out.println(b);
}
else {
	System.out.println(c);
}

	}

}
