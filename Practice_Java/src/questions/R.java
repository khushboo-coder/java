package questions;

public class R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		int row = 1;
		int nst1 = N;
		int nst2 = N;
		int nsp1 = -1;


		while(row<=2*N-1) {
			int cst1 = 1;
			while(cst1<=nst1) {
				System.out.print("* ");
				
				cst1++;
			}
			
			int csp1 = 1;
			while(csp1<=nsp1) {
				System.out.print("  ");
				csp1++;
			}
			int cst2 = 1;
			if(row==1 || row==2*N-1) {
				cst2++;
			}
			while(cst2<=nst2) {
				System.out.print("* ");
				cst2++;
			}
			
			if(row<N) {
				nsp1+=2;
				nst1--;
				nst2--;
			}
			else {
				nst1++;
				nst2++;
				nsp1-=2;
			}
			row++;
			
			System.out.println();
			

			}
		//row++;
		//System.out.println();
			}
		}




	
