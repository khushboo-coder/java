package questions;

public class inverse_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nsp = n-2;
int nst = 2*n;
int count = 5;
while(row<2*n) {
	int csp = 1;
	while(csp<=nsp) {
		System.out.print(" ");
		csp++;
	}
	int cst = 1;
	int val = count;
	while(cst<nst) {
		System.out.print(val + " ");
		if(cst<nst/2) {
			val--;
		}
		else {
			val++;
		}
		cst++;
	}
	
	if(row<2*n) {
		count--;
	}
	else {
		count++;
	}
	row++;
	System.out.println();
	
	//n*=2;
	nst-=2;
	nsp++;
}
	}

}
