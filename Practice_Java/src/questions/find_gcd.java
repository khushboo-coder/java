package questions;
import java.util.*;

public class find_gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
int dividend = sc.nextInt();
int divisor = sc.nextInt();
while(dividend%divisor!=0) {
	 int rem = dividend%divisor;
	divisor = dividend;
	divisor = rem;
}
System.out.println(divisor);
	}

}
