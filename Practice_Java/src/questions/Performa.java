package questions;
interface sampleInterface{
void meth1();	
void meth2();
}
interface childsampleInterface extends sampleInterface{ //interface inheritance
	void meth3();
	void meth4();
}
class Perform implements childsampleInterface{
	public void meth3() {
		System.out.println("This is method 3");
	}
	public void meth4() {
		System.out.println("This is method 4");
	}
	public void meth1() {
		System.out.println("This is method 1");
	}
	public void meth2() {
		System.out.println("This is method 2");
	}


}
public  class Performa{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Perform p = new Perform();
 p.meth1();
 p.meth2();
p.meth3();
p.meth4();
	}

}
