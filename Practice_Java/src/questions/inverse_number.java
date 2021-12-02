package questions;

public class inverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 32145;
int inv = 0;// inverse number
int op = 1;// original position
int od = n%10;// original digit
while(n>=0) {
	 od = n%10;
	 int id = op;// inverse digit
	 int ip = od;// inverse position
	inv =inv+ id*(int)Math.pow(10, ip-1);
	 
	 n/=10;
	 op++;
	
}
System.out.println(inv);
	}

}
