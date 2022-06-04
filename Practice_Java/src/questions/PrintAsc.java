package questions;

public class PrintAsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		printNum(n);
			}
		public static void printNum(int n) {
			//base case
			if(n==0) {
				return;
			}
			printNum(n-1);

			System.out.println(n);

	}

}
