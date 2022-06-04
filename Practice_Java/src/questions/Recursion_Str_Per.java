package questions;

public class Recursion_Str_Per {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
permutation("abcd", "");
	}
public static void permutation(String ques, String ans) {
	//base case
	if(ques.length()==0) {
		System.out.println(ans);
		return;
	}
	for (int i = 0; i < ques.length(); i++) {
	String part1 = ques.substring(0, i);
	String part2 = ques.substring(i+1);
	char ch = ques.charAt(i);
	permutation(part1+part2, ans+ch);
	}
}
}
