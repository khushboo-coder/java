package questions;

public class Is_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "abbvg";
System.out.println(Palindrome(str));
	}
public static boolean Palindrome(String str) {
	int s = 0;
	int e = str.length()-1;
	int count = 0;
	while(s<e) {
		if(str.charAt(s)==str.charAt(e)) {
			return true;
		}

	if(str.charAt(s)!=str.charAt(e)) {
		count++;
	}
	
	s++;
	e--;

	
	}
	if(count==1) {
		return true;
	}

	return false;

}

	
	
}

