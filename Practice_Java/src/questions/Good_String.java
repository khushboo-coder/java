package questions;

public class Good_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cbaeicde";
		System.out.println(goodsubstring(str));

	}
	public static int goodsubstring(String str) {
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < str.length();) {

			if(is_vowels(str.charAt(i))) {
				int count = 0;
				while(i < str.length() && is_vowels(str.charAt(i))) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);
			}
			i++;

		}
		return ans;	

	}
	public static boolean is_vowels(char ch){
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}
}
