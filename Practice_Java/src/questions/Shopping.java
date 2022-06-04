package questions;
import java.util.*;
public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = 0; // aayush
		int h = 0; // harshit
		int i = 1; // pehla phone
		while(a<=m && h<=n ){
		    a+=i;
		    if(a>m){
		        System.out.println("Harshit");
		        break;
		    }
		    i++;
		    h+=i;
		    if(h>n){
		        System.out.println("Aayush");
		        break;
		    }
		    i++;
		}

		    }
		
	}


