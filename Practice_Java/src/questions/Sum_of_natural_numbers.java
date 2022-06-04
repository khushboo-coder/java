package questions;

public class Sum_of_natural_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(nn(5));
	}
public static int nn(int n) {
	if(n==0) {
		return 0;
	}
	int sum = nn(n-1) + n;
	return sum;
	
	
	
	
	
}
}
