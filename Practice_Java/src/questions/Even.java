package questions;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
checkEven(n);
	}
	public static void checkEven(int n) {
		if(n%2==0) {
			System.out.println("Number is Even Number");
		}
		else {
			System.out.println("Number is Odd Number");
		}
	}

}
