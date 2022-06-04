package questions;

public class Powera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(5, 3));
	}
public static int sum(int a, int b) {
	if(b==0) {
		return 1;
	}
	return sum(a, b-1)*a;
}
}
