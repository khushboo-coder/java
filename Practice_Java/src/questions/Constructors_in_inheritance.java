package questions;
class Base1{
	public int x;
	
	public  Base1() {
		System.out.println("I  am a constructor of Base1 class");
	}
	public  Base1(int x) {
		System.out.println("I  am a constructor of Base1 class with a value of x as "+ x);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
class Derieved extends Base1{
	public int y;
	
	public  Derieved() {
		//super(5);
		System.out.println("I am a constructor of derieved class");
	}
	public  Derieved(int x, int y) {
		super(x);
		System.out.println("I  am an overloaded constructor of derieved class with value of y as "+ y);
	}


	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}

class Childofderieved extends Derieved{
	Childofderieved(){
		System.out.println("I am a constructor of child of derieved class");
	}
	Childofderieved(int x, int y, int z){
		super(x,y);
		System.out.println("I am a overloaded class of child of derieved with a value of z as "+ z);
	}
}

public class Constructors_in_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Base1 b = new Base1();
//Derieved d = new Derieved(7,8);
Childofderieved c = new Childofderieved(3,4,5);

	}

}
