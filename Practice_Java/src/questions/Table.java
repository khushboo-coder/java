package questions;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
table(n);
	}
public static void table(int n) {
	for (int i = 1; i<=10; i++) {
		int table = n*i;
		System.out.println(n+ "*" +i +"="+ table);
	}
}
}
