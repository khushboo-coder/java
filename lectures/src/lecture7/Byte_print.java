package lecture7;

public class Byte_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(byte b =1; b<= 127; b++) { // b++ = (byte) (b+1);infinite loop
	System.out.println(b);
}
for(byte b =1; b<= 128; b++) { // b++ = (byte) (b+1);infinite loop
	System.out.println(b);
}
for(byte b =1; b< 127; b++) { // b++ = (byte) (b+1); finite loop
	System.out.println(b);
}

	}

}
