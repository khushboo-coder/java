package questions;

public class Sum_of_odd_even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10000;
		int sum = 0;
		int odd = 0;
		for (int i = 1; i <=n; i++) {
			if(i%2==0) {
				sum = sum + i;
			}
			else {
				odd = odd + i;
			}
		}
		System.out.println(sum);
		System.out.println(odd);

	}

}
