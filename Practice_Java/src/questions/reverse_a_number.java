package questions;

public class reverse_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 23456;
int sum = 0;
while (n!=0) {
	int rem = n%10;
	sum = sum*10+rem;
	n/=10;
	//System.out.println(i);
}
System.out.println(sum);
	}

}
