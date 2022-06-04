package questions;

import java.util.Scanner;

public class Add_2_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(addTwoNum(a, b));
	}
public static int addTwoNum(int a, int b) {
	int sum = a+b;
	int product = a*b;
	return product;
}
}
