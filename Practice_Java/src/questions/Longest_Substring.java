package questions;

public class Longest_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabba";
	    int len = longestUniqueSubstr(str);
	    System.out.println(len);

		
System.out.println();
	}
	public static Boolean areDistinct(String str,
            int k, int j)
{

// Note : Default values in visited are false
boolean[] visited = new boolean[26];

for(int i = k; i <= j; i++)
{
if (visited[str.charAt(i) - 'a'] == true)
return false;

visited[str.charAt(i) - 'a'] = true;
}
return true;
}

//Returns length of the longest substring
//with all distinct characters.
public static int longestUniqueSubstr(String str)
{
int n = str.length();

// Result
int res = 0;

for(int i = 0; i < n; i++)
for(int j = i; j < n; j++)
if (areDistinct(str, i, j))
res = Math.max(res, j - i + 1);

return res;
}


}
