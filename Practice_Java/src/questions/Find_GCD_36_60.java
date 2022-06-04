package questions;
import java.util.Scanner;
public class Find_GCD_36_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
System.out.println("enter the value of a divisor");
int divisor = sc.nextInt();
System.out.println("enter the value of a dividend");
int dividend = sc.nextInt();
System.out.println(GCD(divisor,dividend));
	}
public static int GCD(int a, int b) {

	while(b%a!=0) {
		int rem = b%a;

		
		b = a;
		a = rem;

		//b%=a;
	}
	
	
	return a;
	
}
}
