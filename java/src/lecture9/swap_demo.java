package lecture9;

public class swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,2,3,4,5,6,7};
swap(arr[0], arr[1]);
System.out.println(arr[0] + " "+ arr[1]);
swap1(arr,0,1);
System.out.println(arr[0]+" " + arr[1]);
	}
public static void swap(int a,int b) {
	int t = a;
	a = b;
	b = t;
	return;
}
public static void swap1(int []arr, int a, int b) {
	int t = arr[a];
	arr[a] = arr[b];
    arr[b]= t;
	return;
}
}
