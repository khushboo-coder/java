package questions;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int nst = 1;
int nsp1 = n-1;
int nsp2=n-2;
int row = 1;
int count = 1;
int val = 1;
while(row<=2*n-1) {
	int csp1 = 1;
	while(csp1<=nsp1) {
		System.out.print("  ");
		csp1++;
	}
	int cst = 1;
	while(cst<=nst) {
		System.out.print(val+ " " );
		if(cst<=nst/2) {
			//count++;
			val++;
		}
		else {
			val--;
			//count--;
		}
		//val++;
		cst++;
	}
	int csp2 = 1;
	while(csp2<=nsp2) {
		System.out.print("  ");
		csp2++;
	}

	if(row<n) {
	nst+=2;
	nsp1--;
	nsp2--;
	val++;
	}
	else {
		nst-=2;
		nsp1++;
		nsp2++;
	val--;
	}
	row++;
	val++;

	//nsp2-=2;
	System.out.println();
}
	}

}
