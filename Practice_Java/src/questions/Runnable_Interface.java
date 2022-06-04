package questions;
class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("My thread 1 is a thread not a threat 1");
		}
	}
}
class MyThread2 implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("My thread 2 is a thread not a threat 2");
		}
	}
}

public class Runnable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread1 bullet1 = new MyThread1();
Thread gun1 = new Thread(bullet1);
MyThread2 bullet2 = new MyThread2();
Thread gun2 = new Thread(bullet2);
gun1.start();
gun2.start();
	}

}
