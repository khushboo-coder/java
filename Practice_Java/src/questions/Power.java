package questions;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(3, 8));
	}
public static int power(int a, int b) {
	//base case
	if(b==0) {
		return 1;
	}
	//smaller problem
	int ans = power(a, b-1);
	ans*=a;
	return ans;
}
}
