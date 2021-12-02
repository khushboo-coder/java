package lecture4;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int row = 1;
int n = 5;
int nst = n;
//for 1st row
while (row<=n) {
	int cst =1;
	while(cst<=nst) {
		System.out.print("* ");
		cst++;
	}
	//for 2nd row
	row++;
	System.out.println();
}
	}

}
