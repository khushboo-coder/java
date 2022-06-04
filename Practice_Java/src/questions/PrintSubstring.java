package questions;
import java.util.*;
public class PrintSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
String str = sc.next();
for (int i = 0; i <= str.length(); i++) {
	for (int j = i+1; j <=str.length(); j++) {
		
	
	//System.out.println(str.substring(i,j));
		String s = str.substring(i, j);
	if(isPalindrome(s)) {
		System.out.println(s);
	}
}
	}

}
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}

			else {
				i++;
				j--;

			}
		}
		return true;

}
}
