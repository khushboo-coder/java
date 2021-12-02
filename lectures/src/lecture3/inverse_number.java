package lecture3;

public class inverse_number {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 32145;
int place = 1;
int ans = 0;
while (n>1) {
	int rem = n%10;
	ans = ans + (int) (place * Math.pow(10, rem-1));
	n = n/10;
	place++;
}
System.out.println(ans);
	}

}


