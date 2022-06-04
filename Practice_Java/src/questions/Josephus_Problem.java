package questions;

public class Josephus_Problem {
//death game, 5 log hai, k-1 ko goli marege, fir gun k ke paas jayegi, and last mein kon jinda bacha yeh check karna hai
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(jos(5, 3));
	}
public static int jos(int n, int k) {
	//base case
	if(n==1) {
		return 0;
	}
	int sum= (jos(n-1,k)+k)%n;
	return sum;
}
}
