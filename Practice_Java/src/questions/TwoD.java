package questions;
import java.util.*;
public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
int cols = sc.nextInt();
int [][] numbers = new int [rows][cols];
for (int i = 0; i < rows; i++) {
	for (int j = 0; j < cols; j++) {
		numbers[i][j] = sc.nextInt();
	}
	
}
for (int i = 0; i < rows; i++) {
	for (int j = 0; j < cols; j++) {
		System.out.print(numbers[i][j]+ " ");
	}
	System.out.println();

}
	}

}
