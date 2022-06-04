package questions;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {35,50,15,25,80,20,90,45};
int n = arr[0];
int p = arr[1];
int q = arr[arr.length-1];
for (int i = n; i < q; i++) {
	if(arr[p]>=n || arr[q]<=n) {
		int t;
		t = arr[p];
		arr[p] = arr[n];
		arr[n] = t;
	}
	if(q>p) {
		int y;
		y = arr[q];
		arr[q]= n;
		n = y;
	}
	System.out.println(arr[i]);

}
	}

}

