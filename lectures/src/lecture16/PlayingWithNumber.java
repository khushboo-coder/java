package lecture16;

public class PlayingWithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "cbaeicdejsdfgsdhaeispoaeiioo";
		System.out.println(GoodSubString(str));

	}

	public static int GoodSubString(String str) { // check karna hai konsa substring good substring(a,e,i,o,u) hai, and max length vala  good substring find karna hai
		int ans = Integer.MIN_VALUE;

		for (int i = 0; i < str.length();) {

			if (isvowels(str.charAt(i))) {
				int count = 0;
				while (i < str.length() && isvowels(str.charAt(i))) {
					count++;
					i++;
				}
				ans = Math.max(ans, count);

			}

			i++;

		}
		return ans;

	}

	public static boolean isvowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
