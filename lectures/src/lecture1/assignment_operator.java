package lecture1;

public class assignment_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 8;
		 x+=3; // x = x+3;
		 System.out.println(x);
		 
		 int a = 7;
		 a-=5; // a = a-5; (a mein se 5 minus karke vapis a mein daalna hai.)
		 System.out.println(a);
		 
		 a*=6; // a=a*6;
		 System.out.println(a);
		 
		 a/=7;
		 System.out.println(a);
		 
		 int y = 9;
		 int z = y++ + y++;
		 System.out.println(z);
		 System.out.println(y);
		 
		 int e = 9;
		 int f = ++e + e++;
		 System.out.println(f);
		 System.out.println(e);
		 

	}

}
