package lecture25;

public class Coint_No_2_Head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 3;
coin_toss(n, "", false);
	}
public static void coin_toss(int n, String ans, boolean ishead) {
	// base case
	if(n==0) {
		System.out.println(ans);
		return;
	}
	//head
	if(ishead==false) {
		coin_toss(n-1, ans + "H", true);
	
	}
	//tail
	coin_toss(n-1, ans + "T", false);
}
}
