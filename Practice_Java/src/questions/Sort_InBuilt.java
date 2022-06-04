package questions;
import java.util.*;
public class Sort_InBuilt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {15,14,13,11,89,67,43,21};  
		// sorts subarray form index 2 to 7  
		Arrays.sort(a, 0, 3);   
		//prints array using the for loop  
		for (int i = 0; i < a.length; i++)   
		{       
		System.out.print(a[i]+ " ");   
		}   

	}

}
