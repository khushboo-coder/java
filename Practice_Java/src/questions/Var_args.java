package questions;

public class Var_args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(4,5,6));
System.out.println(sum(2,3));
System.out.println(sum(10,20,30,50));
System.out.println(sum(2.9f,8));
	}
static int sum(int...arr) {
	//available as int [] arr
 	int result = 0;
	for(int value : arr) {
		result+=value;
	}
	return result;
}
static int sum(float x,int...arr) {
	//available as int [] arr
 	int result = 0;
	for(int value : arr) {
		result+=value;
	}
	return result;
}

}
