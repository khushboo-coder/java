package questions;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nst = 1;
while(row<=n) {
	int cst = 1;
	while(cst<=nst) {
		System.out.print("* ");
		cst++;
	}
	nst++;
	row++;
	System.out.println();
}
	}

}