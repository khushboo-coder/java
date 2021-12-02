package lecture3;
import java.util.*; // library use karne ke liye
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in); //input lene ke liye
int n = sc.nextInt(); // integer ka input

int i =2;// i =2 bcoz we have to check from (2 to n-1)
int flag = 0;
while(i<n) {// n is the number to be checked
	if(n%i==0) {
		System.out.println("not prime");
		flag = 1;
		break; //loop se bahar
	}
	i++;
}
if (flag==0) 
System.out.println("prime");
	}

}
