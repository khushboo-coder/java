package questions;
class Ekclass{
	public void meth1() {
	System.out.println("I am a meth1 of class Ekclass");	
	}
}
class Doclass extends Ekclass{
	//@Override
	public void meth1() {
		System.out.println("I am a meth1 of Doclass");
	}
}
public class This_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ekclass e = new Ekclass();
Doclass d = new Doclass();
d.meth1();
	}

}
