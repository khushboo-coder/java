package lecture4;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		int nst  = n; // number of stars
		int nsp = 0; // number of space
		while(row<=2*n-1) {
			int csp = 1;// pehle space pe work karege
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}

			int cst = 1;// fir stars pe work karege
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			if(row<n) {
				nsp+=2;
				nst--;
			}
			else {
				nst++;
				nsp-=2;
			}
			
			row++;// for next row
			
			System.out.println();
			

			}

		}

			}




	


