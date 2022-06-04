package questions;

public class Queue {
private int [] arr;
private int front; //front ek variable hai ke hume element konse index se nikalna hai
private int size; // size track rakhege ki element kha rakhna hai and total elements kitne hai.
public Queue() {
	this.arr = new int [5];
	this.front=0;
}
public Queue(int cap) {
	this.arr = new int[cap];
	this.front = 0;
}
public boolean isEmpty(){
	return this.size==0;
}
public boolean isFull() {
	return this.size==this.arr.length;
}
public void Enqueue(int item) throws Exception {
	if(this.isFull())  {
		throw new Exception ("Ek baar mein smjh nhi aata hai queue full ho chuka hai");
	}
	int idx = (this.front+this.size)%this.arr.length;
this.arr[idx]	= item;// this.arr pe idx vale index pe item ko add kar de.
this.size++; // size ko aage badayege
}
public int Front(int item) { // jaise stack mein peek pe dekhe they konsa element hai, vhi dekhna hai
	 item = this.arr[this.front];
	return item;
}
public int dequeue(int item) throws Exception { // front se element nikal ke front ko ek aage bda dena hai
	if(this.isEmpty()) {
		throw new Exception("Queue abhi khali hai, koi element remove nahi kr sakte");
	}
	 item = this.arr[this.front]; // item nikal rahe hai front se
	this.size--; // ek element nikal liya toh size bhi toh kmm kr de
	this.front= (this.front+1)%arr.length; // uske baad front ko ek aage kr do.
	return item;
}
public int size() {
	return this.size();
}
public void display() {
	for (int i = 0; i <this.size; i++) {
		int idx = (this.front+i)%this.arr.length;
		System.out.print(this.arr[idx]+ "->");

	}
	System.out.println(".");
}
}
