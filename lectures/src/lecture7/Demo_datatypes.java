package lecture7;
import java.util.*;
public class Demo_datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
int n = 1000_000_000;
System.out.println(n);
long l = 1000_000_00000000l;
//long ll = sc.nextLong();
//System.out.println(ll);

byte b = 89;

float f = 6.7f;
double d = 9.9;

b = (byte)d;
System.out.println(b);
char ch = 'a';
System.out.println((int)ch);
char ch1 = '0';
int i = 0;
System.out.println(i);
System.out.println((int)ch1);
//ch++;
System.out.println(ch++);
// System.out.println((char) (1+ch));
ch = (char) (1+ch);
System.out.println(ch+=1);
ch = sc.next().charAt(0);
System.out.println(ch);

double dd = sc.nextDouble();
boolean bb = sc.nextBoolean();

System.out.println(dd);
System.out.println(bb);
	}

}

