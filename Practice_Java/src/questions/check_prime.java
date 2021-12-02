package questions;
import java.util.*;
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int flag = 0;
int i = 2;
while ( i < n) {
	if(n%i==0) {
		System.out.println("Not a Prime number");
		flag=1;
		break;
	}
	i++;
}
	if(flag==0) {
	System.out.println("Prime Number");
}
//System.out.println(n);
	}

}

