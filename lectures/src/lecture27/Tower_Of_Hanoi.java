package lecture27;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
toh(3, "T1", "T2", "T3");
	}
public static void toh(int n,String t1,String t2, String t3) { //String source  = t1, String destination = t2, String helper = t3

	if(n==0) {
		return;
	}
	toh(n-1,t1,t3,t2);
	System.out.println(n+"th disc move from "+ t1 + " to " + t2);
	toh (n-1,t3,t2,t1);
	
}
}
