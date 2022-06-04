package questions;

public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;
for (int i = 0; i <= n; i++) {
	int count = 1;
for (int j = n; j > i; j--) {
		System.out.print(count+ " ");
		count++;
	}
	System.out.println();
}
	}

}
