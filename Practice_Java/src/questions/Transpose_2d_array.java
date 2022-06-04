package questions;

public class Transpose_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] [] original = {{1,3,4},{2,4,3},{3,4,5}};
int [] [] transpose = new int [3] [3];
//Transpose
for (int i = 0; i < transpose.length; i++) {
	for (int j = 0; j < transpose.length; j++) {
		transpose[i][j] = original[j][i];
	}

	
}
System.out.println("Original 2D Array");
for (int i = 0; i < transpose.length; i++) {
	for (int j = 0; j < transpose.length; j++) {
		System.out.print(original[i][j] + " ");
	}
	System.out.println();
}
System.out.println("Transposed 2D Array");
for (int i = 0; i < transpose.length; i++) {
	for (int j = 0; j < transpose.length; j++) {
		System.out.print(transpose[i][j] + " ");
		
	}
	System.out.println();
}
	}

}
