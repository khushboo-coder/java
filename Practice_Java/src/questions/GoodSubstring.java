package questions;
import java.util.*;
public class GoodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(goodString(str));
	}
	public static int goodString(String str) {
		//int count = 0;
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			if(isVowel(str.charAt(i))) {
				int count = 0;
				while (i < str.length() && isVowel(str.charAt(i))) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);

			}

			i++;

		}
		return ans;


	}



	public static boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}


