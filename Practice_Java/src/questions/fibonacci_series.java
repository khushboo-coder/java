package questions;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fibonacci series is sum of two previous digits
int a = 0;
int b = 1;
int c;
for (int i = 1; i <= 10; i++) {
	c = a+b;
	
	System.out.print(a + " ");// first number ka value print karvana hai
	
	a=b;
	b=c;
}

//System.out.println(c);
	}

}
