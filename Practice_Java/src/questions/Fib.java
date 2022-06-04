package questions;
import java.util.*;
public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		int c;
		//int row = 0;

		for (int j = 0; j < n; j++) {

				

					//System.out.print(a + "\t ");
					c = a+b;
					a = b;
					b = c;
				}
				//System.out.print(a + " \t");
				System.out.println(a);
			}

		}






