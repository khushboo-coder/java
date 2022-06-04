package questions;

public class X_power_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 4;
int b = 2;
System.out.println(power(a, b));
	}
public static int power(int a,int b) {
	//base case
	if(b==0) {
		return 1;
	}
	if(a==0) {
		return 0;
	}
	return power(a, b-1)*a;
}
}
