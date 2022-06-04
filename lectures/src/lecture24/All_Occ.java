package lecture24;

public class All_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,2,6};
index(arr, 2, 0); //All Occurance

	}
public static void index(int [] arr, int item, int i) {
	if(i == arr.length) {
		return;
	}
	if(arr[i] == item) {
		System.out.println(i);
	}
	index(arr, item, i+1); 
}
}
