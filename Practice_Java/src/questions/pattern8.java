package questions;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nsp = n;
int nst = 1;
while(row<=n) {
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
	row++;
	System.out.println();
	
	nst++;
	nsp--;
}
	}

}
