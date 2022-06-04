package questions;

public class Palindrome_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPalindrome("racecar", 0,6));
	}
public static boolean isPalindrome(String s,int l, int r) {
	//positive base case
	if(l<=r) {
		return true;
	}
	//negative base case
	if(s.charAt(l)!=s.charAt(r)) {
		return false;
	}
	return isPalindrome(s, l+1, r-1);
}
}
