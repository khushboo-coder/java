package questions;

public class Recursion_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IN(5);

DN(5);
	}
public static void DN(int n) {
	if(n==0) {
		return;
	}
	System.out.println(n);

	 DN(n-1);
	 

}
public static void IN(int n) {
	if(n==0) {
		return;
	}
	IN(n-1)	;

	 System.out.println(n);
}
}
