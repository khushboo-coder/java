package questions;
class Mythread3 extends Thread{
	@Override
	public void run() {
		while(true) {
		System.out.println("Thread1 for cooking");
		System.out.println("I am happy");
	}
	}
}
class Mythread4 extends Thread{
	@Override
	public void run() {
		while(true) {
		System.out.println("Thread2 for chatting with her");
		System.out.println("I am sad");
	}
	}
}
public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mythread3 t1= new Mythread3();
Mythread4 t2= new Mythread4();
t1.start();
try {
	//t1.join();
	t1.sleep(455);
}
catch(InterruptedException e) {
	System.out.println(e);
}
t2.start();
t2.setPriority(Thread.MAX_PRIORITY);
	}

}
