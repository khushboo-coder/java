package questions;

public class Boston_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 378;
		//System.out.println(checkBostonNum(n));
		//System.out.println(checkPrime(n));
		if(checkBostonNum(n)==checkPrime(n)) {
			System.out.println("Number is a Boston Number");
		}
		else {
			System.out.println("Number is not a Boston Number");
		}
	}
	public static int checkBostonNum(int n) {
		int sum = 0;
		for (int i = 0; i <=n; i++) {
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		return sum;	
	}
	public static int checkPrime(int n) {
		int prime = 0;
		int i = 2;

		while (n>0) {

			if(n%i==0) {

				prime = prime + checkBostonNum(i); //prime factors ki digits ka digits ka sum (eg 22 -> 2,11 toh yeh hoga 2+1+1 = 4)
				n = n/i;

				//System.out.println(prime);
				//System.out.println("n is" + n);

			}
			else {
				i++;
			}
		}
		return prime;

	}
}
