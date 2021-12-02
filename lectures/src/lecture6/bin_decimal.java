package lecture6;

public class bin_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 101111;
int sum = 0;
int mul = 1;
while(n!=0) {
	int rem = n%10;// 10 is destination base
	 sum = sum + rem*mul;
	 n/=10;
	 mul*=2;// 2 is source
}
System.out.println(sum);
	}

}
