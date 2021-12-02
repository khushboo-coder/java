package lecture6;

public class Octal_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 44;
int sum = 0;
int mul = 1;
while(n!=0) {
	int rem = n%10;
	sum = sum + rem*mul;
	n/=10;
	mul*=8;
}
System.out.println(sum);
	}

}
