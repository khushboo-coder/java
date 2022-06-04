package questions;
import java.util.*;
public class Palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
int rem;
int temp = n;

while (n>0) {
rem = n%10;
//n/=10;
sum = (sum*10) + rem;

n=n/10;
}

/*if(n==sum) {
	System.out.println("Palindrome Number");
}
else {
	System.out.println("Not a Palindrome Number");
}
//System.out.println(i);
}*/
if(temp == sum) {
	System.out.println("Palindrome Number");
}
else {
	System.out.println("Not a Palindrome Number");
}

	}

}
