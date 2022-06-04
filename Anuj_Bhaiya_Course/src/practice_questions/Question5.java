package practice_questions;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of year");
int year = sc.nextInt();
if(year%4==0) {
	System.out.println("This year is a leap year");
}
else {
	System.out.println("This year is not a leap year");
}
	}

}
