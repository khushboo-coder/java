package questions;
import java.util.*;
public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner  (System.in);
		int n = sc.nextInt();
		Inverse(n);
	}
	public static void Inverse(int n) {
		int od = n%10;
		int op = 1;
		int inv = 0;
		while(n>0) {
			 od = n%10;
			//n/=2;
			//int op = n-1;
			int id = op;
			int ip = od;
			inv =inv+ id*(int)Math.pow(10, ip-1);
n/=10;
op++;
		}
		System.out.println(inv);

	}
}
