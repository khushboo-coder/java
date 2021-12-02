package lecture9;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {2,1,3,67,8,9};
int item = 6;
System.out.println(linearsearch(arr, item));
	}
public static int linearsearch(int[]arr,int item) {
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==item) {
			return i;
		}
		//return -1;
	}
	return -1;
}
}
