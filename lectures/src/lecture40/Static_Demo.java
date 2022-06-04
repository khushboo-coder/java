package lecture40;
import lecture38.*;
public class Static_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bye");
		fun();
		
		System.out.println(Prime_Seive.is_prime(100));
		

	}
	
	public static void fun() {
		System.out.println("I am in fun");
		
	}
	
	static {
		System.out.println("hey");
		fun();
		
		System.out.println("I am in Static");

}
}
