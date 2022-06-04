package questions;
import java.util.*;
public class Sum_of_2_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n = sc.nextInt();
int [] a = new int [n];
for (int i = 0; i < a.length; i++) {
	a[i] = sc.nextInt();
}
int m = sc.nextInt();
int b [] = new int [m];
for (int i = 0; i < b.length; i++) {
	b[i] = sc.nextInt();
}
int u = a.length;
int []c = new int [u];
int sum = 0;
for (int i = 0; i < c.length; i++) {
c[i] = Math.addExact(a[i], b[i]);	

System.out.print(c[i] + " ");
}
//System.out.println(c);		
	}
	

}
