package questions;
import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkPrime(n);
	}
	public static void checkPrime(int n) {
		int flag = 0;

		for (int i = 2; i <=n-1; i++) {
			if(n%i==0) {

				System.out.println("Number is not a prime number");
				flag=1;
				break;
			}

		}
		if(flag==0) {
			System.out.println("Number is a prime number");
		}
	}
}
