package questions;
import java.util.*;
public class boston {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int result = sumDigits(n);
int i =2;
int sum = 0;
while(n>0) {
	if(n%i==0) {
		sum = sum + sumDigits(i);
		n/=i;
	}
	else {
		i++;
	}
	
}
	}
public static int sumDigits(int n) {
	int sum = 0;
	while(n>0) {
		int rem = n%10;
	 sum =+ rem;
	n=n/10;
	}
	return sum;

}
}
