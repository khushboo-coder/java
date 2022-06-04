package questions;

public class Dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 47;
		int rem;
		int sum = 0;
		int mul =1;
		while(n!=0) {			rem = n%2;

		sum = sum+rem*mul;
		n=n/2;
		mul*=10;

		}
		System.out.println(sum);

	}
}



