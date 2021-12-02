package lecture4;

public class pattern11 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n-1;
		int val = 1;
		while(row<=n) {
			int csp = 1;
		while(csp<=nsp) {
			System.out.print("  ");
			csp++;
		}
		int cst = 1;
		while(cst<=nst) {
			System.out.print(val+ " " );
			val++;
			cst++;
		}
		row++;
		nst+=2;
		nsp--;
		System.out.println();


		}

	}

}


