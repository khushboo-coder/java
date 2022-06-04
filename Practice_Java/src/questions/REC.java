package questions;

public class REC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
System.out.println(sumOfNatural(n));

	}
public static int sumOfNatural(int n) {
	
	// base case
	if(n==0) {
		return 0;
	}
	int sum = sumOfNatural(n-1);
	return sum+n ;

	
}
}
