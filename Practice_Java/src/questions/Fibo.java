package questions;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int f1 = 0;
		int f2 = 1;
		for (int i = 0; i <=n; i++) {
			System.out.print(f1 + " ");

			int sum = f1+f2;
			f1 = f2;
			f2 = sum;
		}

	}

}
