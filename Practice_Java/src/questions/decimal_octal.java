package questions;

public class decimal_octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 15;
int sum = 0;
int mul = 1;
while(n!=0) {
	int rem = n%8;
	sum = sum+rem*mul;
	n/=8;
	mul*=10;
}
System.out.println(sum);
	}

}
