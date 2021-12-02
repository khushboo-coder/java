package questions;

public class pattern8_inverse8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nsp = n;
		int nst = 1;
		while(row<=2*n) {
			int csp = 1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			//row++;
			//System.out.println();
			
			//nst++;
			//nsp--;
			if(row<n) {
				nst++;
				nsp--;
			}
			else {
				nst--;
				nsp++;
			}
			row++;
			System.out.println();
		}

	}

}
