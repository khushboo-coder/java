package lecture26;

public class Pemutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrintAllPermutation("abcd", "");
	}
public static void PrintAllPermutation(String ques, String ans) {
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	for (int i = 0; i < ques.length(); i++) {
	String part1 = ques.substring(0,i); // i ke left side vale char nikal liye
	String part2 = ques.substring(i+1); // i ke right side vale char nikal liye
	char ch = ques.charAt(i); // i vala jo char hai voh find kr liya. jo fix karna kai
	PrintAllPermutation(part1+part2, ans+ch); // ab ans mein fix vala char add karege, and then ek ek karke sab char add karege
	
	}
}
}
