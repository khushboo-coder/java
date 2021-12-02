package lecture7;

public class function {
	public static void main(String[] args) {
		
System.out.println("hey");
addition();//calling
//int k = addition1();
//System.out.println(k);
System.out.println(addition1());

System.out.println("bye");

}
	public static void addition(){
		int a = 9;
		int b = 10;
		int c = a+b;
		System.out.println(c);
		
		if(c!=19) {
			return;
		}
		System.out.println("bye add");
		System.out.println("hye add");
	}
	
	public static int addition1() {
		int a = 90;
		int b = 10;
		int c = a+b;
		return c;
	}
}