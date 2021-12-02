package lecture4;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nst  = 1; // number of stars
int nsp = n-1; // number of space
while(row<=n) {
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
	
	
	row++;// for next row
	
	System.out.println();
	nsp--;
	nst++;

	}
	}
}



