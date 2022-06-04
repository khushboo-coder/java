package questions;

public class MAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {2,1,3,67,8,9}; //kis index  pe max value hai check krni hai
System.out.println(maxIndex(arr));
	}
public static int maxIndex(int [] arr) {
	int max = Integer.MIN_VALUE;
	int index = 0;
	for (int i = 0; i < arr.length; i++) {
		if(max<=arr[i]) {
			index = i;
			max = arr[i];
		}
	}
	return index;
	//return max;
	}


}
