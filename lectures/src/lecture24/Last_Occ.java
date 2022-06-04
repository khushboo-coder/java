package lecture24;

public class Last_Occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,2,4,3,6};
System.out.println(index(arr, 3, arr.length-1)); //Last Occurance

	}
public static int index(int [] arr, int item, int i) {
	if(i==-1) {
		return -1;
	}
	if(arr[i] == item) {
		return i;
	}
	return index(arr, item, i-1);
}

}
