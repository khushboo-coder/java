package questions;

public class decimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5; // decimal number
int sum = 0;
int mul = 1;
while(n!=0) {
	int rem = n%2;
	sum = sum+rem*mul;
	n/=2;
	mul*=10;
}
System.out.println(sum);
	}

}
