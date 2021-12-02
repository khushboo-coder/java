package lecture1;

public class increment_decrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = a++;
		// a++; //post increment (pehle print hoga fir add hoga)
		System.out.println(b); // a = a+1;
		System.out.println(a);
		
		

		//++a; //pre increment (pehle add hoga fir print hoga)
		int a1 = 6;
		int b1 = ++a1;// b1 = a1 + 1;
		System.out.println(b1);
		System.out.println(a1);
		
		//decrement
		// v--; post decrement (pehle print hoga fir minus print hoga)
		int v = 9;
		int x = v--;
		System.out.println(x);
		System.out.println(v);
		
		//--v1; pre decrement (pehle minus hoga fir print hoga)
		
		
		int v1 = 8;
		int n = --v1;
		System.out.println(n);
		System.out.println(v1);
		
		int w = 9;
		w++;
		System.out.println(w);
		
		


	}
}
