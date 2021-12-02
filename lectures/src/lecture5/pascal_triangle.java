package lecture5;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 6;
int row = 0;
while(row<n) {
	int r = 0;
	int val = 1; //nc0
	while(r<=row) {
		System.out.print(val + "\t");
		//ncr+1 = (n-r)*ncr))/(r+1);
		val = ((row-r)*val/(r+1));
		r++;
	}
	System.out.println();
	row++;
}
	}

}
