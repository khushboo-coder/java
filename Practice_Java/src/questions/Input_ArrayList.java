package questions;
import java.util.ArrayList;
import java.util.Scanner;
public class Input_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
ArrayList <Integer> list = new ArrayList<>();
int n = 5;
for (int i = 0; i < n; i++) {
	int a = sc.nextInt();
	list.add(a);
}
for (int i = 0; i <list.size(); i++) {
	System.out.print(list.get(i)+" ");
}
System.out.println();
for(int val: list) {
	System.out.print(val+" ");
}
System.out.println();
System.out.println(list);

	}

}
