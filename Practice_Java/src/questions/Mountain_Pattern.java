package questions;
import java.util.*;
public class Mountain_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int row = 1;
		int nst1 = 1;
		int nst2 = 1;
		int nsp1 = N-1;


		while(row<=N) {
			int cst1 = 1;

			while(cst1<=nst1) {
				System.out.print("* ");
				cst1++;
			}

			int csp1 = 1;

			while(csp1<=nsp1) {
				System.out.print("    ");
				csp1++;
			}
			int cst2 = 1;

			while(cst2<=nst2) {
				System.out.print("* ");

				cst2++;
			}
			

			nst1++;
			nst2++;
			nsp1--;



			row++;
			//nsp1-=2;


			System.out.println();


		}

	}
}


