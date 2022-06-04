package questions;

import java.util.Scanner;

public class Factorial_of_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
findFactorial(n);
	}
public static void findFactorial(int n) {
	if(n<0) {
		System.out.println("Invalid Number");
		return;
	}
	int fact = 1;
	//int newi = 0;
	for (int i = n; i>=1; i--) {
		
		fact= fact*i;
		//System.out.println(sum);
		//int ft = ft + fact;
		//System.out.println(ft);

		 //newi = newi + fact;
	}
	System.out.println(fact);
}
}
