package questions;
import java.util.*;
public class Bb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i =2;
int sum = 0;
int sum1 = sum1(n);
while(n<i);
if(n%i==0) {
	sum+=sum1(i);
	n/=i;
}
else {
	i++;
}
if(sum==sum1) {
	System.out.println("0");
}
else {
	System.out.println("1");
}
	}
public static int sum1(int n) {
	int sum = 0;
	while(n>0) {
	int rem = n%10;
	 sum = sum+rem;
	n/=10;
	
}
	return sum;
}
}
