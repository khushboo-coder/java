package questions;

public class Matrix_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// question is find the number of ways in n x m matrix.
	int [] [] arr = new int[4][3];
	System.out.println(count(4, 3));
	}
public static int count(int n, int m) {
	//base case
	if(n==1 || m==1) {
		return 1;
	}
	int sum = count(n-1,m)+count(n,m-1);
	return sum;
}

}
