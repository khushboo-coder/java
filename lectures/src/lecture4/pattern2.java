package lecture4;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int row = 1;
int nst = 1;
while (row<=n) {
	// self work
	int cst = 1;
	while(cst<=nst) {
		System.out.print("* ");
		cst++;
	}
	//next row
	row++;
	System.out.println();
	nst++;
}

	}

}
