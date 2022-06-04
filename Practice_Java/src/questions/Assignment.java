package questions;
import java.util.*;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();//Size of an array
		int [] arr = new int [N];
		for(int i= 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
			reverse_array(arr);
		
		}
		

		    }
			public static int reverse_array(int[] a ){
				for(int i=a.length-1; i<=a.length; i--){
					//System.out.print(a[i]+ " ");
				}
				
			}
	}


