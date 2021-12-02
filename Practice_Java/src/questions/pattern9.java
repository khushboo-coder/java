package questions;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nsp = n;
int nst = n;
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
	if(row<n) {
		nst--;
		nsp++;
	}
	else {
		
		nsp--;
		nst++;
	}
	row++;
	System.out.println();
}
	}

}
