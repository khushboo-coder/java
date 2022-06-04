package questions;
import java.util.*;
public class Arraylist_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
ArrayList<Integer> list = new ArrayList<>();
int n = 5; //size
for (int i = 0; i < n; i++) {
	int a = sc.nextInt();
	list.add(a);
	
}
for (int i = 0; i < list.size(); i++) {
	System.out.print(list.get(i) + " ");
	
}
System.out.println();
for(int val : list) {
	System.out.print(val + " ");
}
	}

}
