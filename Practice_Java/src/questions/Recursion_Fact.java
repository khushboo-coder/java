package questions;

public class Recursion_Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fact(4));
	}
public static int fact(int n) {
	if(n==1) {
		return 1;
	}
	int f = fact(n-1);
	return n*f;
}
}
