package questions;

public class BitMasking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// get bit
		//a bitmask
		// b and operator
int n = 5;
int pos = 2;
 int bitMask = 1<<pos;
 if((bitMask & n)==0) {
	 System.out.println("Bit was zero");
 }
 else {
	 System.out.println("Bit was one");
 }
 
 // set bit
 //a bitmask
 // b or operator
 int newNumber = bitMask | n;
 System.out.println(newNumber);
 
 // clear bit (bit ko zero bnana hai)
 //a bitmask
 //b operation : and with not (bitmask ka not)  pehle bitmask ka not (opposite krna hai, 1s compliment krna hai) nikal lijiye fir and perform krna hai.
 int notBitMask = ~(bitMask);
 int newNumber2 = notBitMask & n;
 System.out.println(newNumber2);
 
 // update bit
 // case 1: agr zero bnana hai (clear bit vala same perform krege)
 // case 2: agr 1 bnana hai (set bit vala same perform krege)
 
 
 
 
 
	}

}
