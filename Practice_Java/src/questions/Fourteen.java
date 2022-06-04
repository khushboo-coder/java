package questions;

public class Fourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 4; //diamond pattern
//upper half
for (int i = 1; i <=n; i++) {
	for (int j = 1; j <= n-i; j++) {
		System.out.print(" ");
	}
	for (int j = 1; j <=i; j++) {
		System.out.print("*"+" ");
	}
	for (int j = 1; j <= n-i; j++) {
		System.out.print(" ");
	}
	System.out.println();
}
//lower half
for (int i = n; i >= 1; i--) {
	for (int j = 1; j <= n-i; j++) {
		System.out.print(" ");
	}
	for (int j = 1; j <=i; j++) {
		System.out.print("*"+" ");
	}
	for (int j = 1; j <= n-i; j++) {
		System.out.print(" ");
	}
	System.out.println();
}

	}

}
