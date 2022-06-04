package questions;

public class Matrix_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(count(4, 3));
	}
public static int count(int n,int m) {
	if(n==1||m==1) {
		return 1;
	}
	return count(n-1, m) + count(n, m-1);
}
}
