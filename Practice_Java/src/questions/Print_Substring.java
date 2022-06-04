package questions;
import java.util.*;
public class Print_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String str = sc.next();
Substring(str);

	}
public static void Substring(String str) {
	int n = str.length();
	for (int i = 0; i <n; i++) {
		for (int j = i+1; j <=n; j++) {
			String s = str.substring(i, j);
			if(is_palindrome(s)) {
				System.out.println(s);
			}
			
		}
	}
}
public static boolean is_palindrome(String str) {
	int i = 0; //pointer 1
	int j = str.length()-1; // pointer 2
	while(i<j) {
	if(str.charAt(i)!=str.charAt(j)) {
		return false;
	}
	i++;
	j--;

}
	return true;

}
}
