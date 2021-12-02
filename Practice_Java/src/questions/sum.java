package questions;
//import java.util.*;
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
		int n = 2345;
int sum = 0;
while(n > 0) {
	int rem = n%10;
	sum = sum+rem;
	n/=10;
	//sum++;
}
System.out.println(sum);
	}

}
