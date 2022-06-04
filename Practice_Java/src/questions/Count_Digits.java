package questions;
import java.util.*;
public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
int digit = sc.nextInt();
int count = 0;
int sum = 0;
while(number>0) {
	int rem = number%10;
	if(rem==digit) {
		count++;
	}
	number/=10;
	
}
System.out.println(count);
	}

}
