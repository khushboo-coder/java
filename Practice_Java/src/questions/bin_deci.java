package questions;

public class bin_deci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 100;
int sum = 0;
int mul = 1;
while(n!=0) {
	int rem = n%10;
	sum = sum+rem*mul;
	n/=10;
	mul*=2;
}
System.out.println(sum);
	}

}
