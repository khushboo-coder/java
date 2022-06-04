package questions;

public class Kadanes_Principle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {-11,7,9,-2,3};
int sum = 0;
int ans = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
	sum+=arr[i];
	ans = Math.max(ans, sum);
	
	if(sum<0) {
		sum=0;
	}

}
System.out.println(ans);
	}

}
