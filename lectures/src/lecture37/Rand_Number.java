package lecture37;
import java.util.*;
public class Rand_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random_number(6,10);

	}

	public static void Random_number(int si, int ei) {

		Random rand = new Random();
		int lo = si;
		int hi = ei;
		for (int i = 0; i <10; i++) {
			int ri = rand.nextInt(hi - lo+1)+lo; 
			System.out.println(ri);
		}
		
		

	}

}
