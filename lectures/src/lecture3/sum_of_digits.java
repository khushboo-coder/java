package lecture3;

public class sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 2345;
int sum = 0;
int rem;

while(n>0) {
rem = n%10;
sum += rem;
n = n/10;
}
System.out.println(sum);
	}

}
