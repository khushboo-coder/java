package questions;

import java.util.Scanner;

public class Print_My_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String name = sc.next();
printMyName(name);
	}
public static void printMyName(String name) {
	System.out.println(name);
	return;
}
}
