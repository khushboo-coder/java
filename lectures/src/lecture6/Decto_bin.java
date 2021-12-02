package lecture6;

public class Decto_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 47;
int sum = 0;
int mul = 1;

while(n!=0) {
	int rem = n%2; // dis base is 2
	sum = sum +rem*mul;
	n/=2;
	mul*=10;
	
}
System.out.println(sum);
	}

}
