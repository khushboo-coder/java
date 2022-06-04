package questions;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
int val = 0;
int num = 1;
for (int i = 1; i <= n; i++) {
	for (int j = 1; j <=i; j++) {
		if ((i+j)%2==0) { // even numbers (agr i+j krege toh even number aayega and vha 1 print krvana hai)
			System.out.print(num + " ");
		}
		else {
			System.out.print(val + " ");
		}
	}
	System.out.println();
}
	}

}
