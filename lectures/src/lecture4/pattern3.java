package lecture4;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row = 1;
int n = 5;
int nst = n;
while(row<=n) {
	int cst = 1;
	while(cst<=nst) {
		System.out.print("* ");
		cst++;
	}
	row++;
	System.out.println();
	--nst;
}
	}

}
