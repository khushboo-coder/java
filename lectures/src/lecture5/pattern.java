package lecture5;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nsp = n-1;
int nst = 1;
int count = 1;
while(row<=2*n-1) {
	int csp = 1;
	while(csp<=nsp) {
		System.out.print("  ");
		csp++;
	}
	int cst = 1;
	int val = count;
	while(cst<=nst) {
		System.out.print(val+ " " );
		if(cst<=nst/2) {
			val++;
		}
		else {
			val--;
		}
		cst++;
		
	}
	if(row<n) {
		nst+=2;
		nsp--;
		count++;
		
		}
	else {
		nst-=2;
		nsp++;
		count--;
		
	}
	row++;
	//count++;
	System.out.println();
}
	}

}
