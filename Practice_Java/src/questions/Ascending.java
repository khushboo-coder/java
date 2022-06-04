package questions;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ascending(5);
	}
public static void ascending(int n) {
	//base case
	if(n==0) {
		return;
	}
	System.out.println(n);
	ascending(n-1);
	System.out.println(n);
}
}
