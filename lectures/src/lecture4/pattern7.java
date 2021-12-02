package lecture4;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5;
int nsp1=0;
int nsp2 = n-2;
int row = 1;
while (row<=n) {
	//self work
	// 1st space
	int csp1 = 1;
	while (csp1<=nsp1) {
		System.out.print("  ");
		csp1++;
	}
	// 1st star
	System.out.print("* ");
	//2nd space
	int csp2 = 1;
	while(csp2<=nsp2) {
		System.out.print("  ");
		csp2++;
	}
	// 2nd star
	if (row != (n+1)/2) {
		System.out.print("* ");
	}
	if(row <= n/2) {
		nsp2 -= 2;
		nsp1++;
	}
	else {
		nsp2 += 2;
		nsp1 --;
	}
	row++;
	System.out.println();
}

	}

}
