package questions;

public class Multiples_of_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 10000;
int num = 7;
//int multiples = 0;
int count = 0;
for (int i = 1; i <=n; i++) {
	if(i%num==0) {
	//multiples = num*i;
	count++;
	//System.out.println(multiples);
}
}
System.out.println(count);
	}

}
