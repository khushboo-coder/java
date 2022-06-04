package questions;
import java.util.*;
public class Chewbacca_and_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long d=n;
		long x=0;
		long rem=0;
		long rev=0;

			while(d!=0)
			{
				rem=d%10;
				x=9-rem;
				if(x<rem)
				{
					rev=rev*10+x;
					
				}
				else if (x>rem)
				{
					rev=rev*10+rem;
				}
		        else if(x==0)
		        {
				

		        }
				d=d/10;
		        

		        
		        
			}
			/*long m=rev;
			long rem2=0;
			long rev2=0;
			while(m!=0)
			{
				rem2=m%10;
				rev2=rev2*10+rem2;
				m=m/10;
			}
			System.out.println(rev2);*/
			System.out.println(rev);
		}



	}



