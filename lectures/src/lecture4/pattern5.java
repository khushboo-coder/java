package lecture4;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nst  = n; // number of stars
int nsp = 0; // number of space
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
	nsp++;
	nst--;

	}
	}
}



