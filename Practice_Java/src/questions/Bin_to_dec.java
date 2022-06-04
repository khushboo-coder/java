package questions;

public class Bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 101111;
int rem;
int sum = 0;
int mul = 1;
while(n!=0) {
	rem = n%10;
	sum = sum+rem*mul;
	n=n/10;
	mul*=2;
}
System.out.println(sum);
	}

}
