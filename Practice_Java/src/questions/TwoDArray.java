package questions;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] [] arr = {{1,3,4},{2,4,3},{3,4,5}};
/*arr [0][0]= 70;
arr [0][1]=90;
arr[0][2]=77;
arr[1][0]=45;
arr[1][1]=54;
arr[1][2]=43;
arr[2][0]=32;
arr[2][1]=23;
arr[2][2]=22;*/
for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr.length; j++) {
		System.out.print(arr[j][i]+ " ");
		
	}
	System.out.println();
}
	}

}
