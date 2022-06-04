package questions;

public class PowerString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
powerstring("abc", "");
	}
public static void powerstring(String ques, String ans) {
	//base case
	if(ques.length()==0) {
		System.out.println(ans);
		return;
		
	}
	// 0th character nikalege
	char ch = ques.charAt(0);
	//yes ka call lagayege
	powerstring(ques.substring(1), ans+ch); // yes ki call hai, jab character ko include karege
	powerstring(ques.substring(1), ans);// no ki call hai, jab character ko include nhi karege
	// ans voh substring hai jo banega
}
}
