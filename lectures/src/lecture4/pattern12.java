package lecture4;

public class pattern12 {
	public static void main(String[] args) {


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
		
		cst++;
	}
	row++;
	val++;
	nst+=2;
	nsp--;
	System.out.println();


	}

}


}


