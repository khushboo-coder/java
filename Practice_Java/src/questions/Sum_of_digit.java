package questions;

public class Sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int m = 4;
		int n = 2345;
		int sum = 0;

while(n>0) {
			int rem = n%10;

			sum = sum+rem;
			n=n/10;
		}
		
		System.out.println(sum);


	}
}
