package questions;

public class Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
f(5);
	}
public static void f(int n) {
	//base case
	if(n<0) {
		return;
	}
System.out.println(n);
f(n-1);
}
}
