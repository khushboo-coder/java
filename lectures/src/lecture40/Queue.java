package lecture40;

public class Queue {

	protected int [] arr;
	protected int front;
	private int size;
	public Queue() {
		this.arr = new int[5];
		this.front = 0;
		this.size = 0;
	}
	
	public Queue(int cap) {
		this.arr = new int[cap];
		this.front = 0;
		this.size = 0;

	}
	
	public void Enqueue(int item)throws Exception { // add the items same as push in stack
		
		if(this.is_full())  {
			throw new Exception ("Ek baar mein smjh nhi aata hai queue full ho chuka hai");
		}
		int idx = (this.front+this.size)%this.arr.length;
	this.arr[idx]	= item;// this.arr pe idx vale index pe item ko add kar de.
	this.size++; // size ko aage badayege
	}

	public boolean is_empty() {
		
			return this.size==0; // size zero hoga
		}
	
	public boolean is_full() {
		return this.size == this.arr.length; // size arr.length ke equal hoga.
	}
	
	public int getFront() { // opposite of peek in stack, ye dekhege ki queue mein front pe konsa element hai
		int item = this.arr[this.front];
		return item;
	}
	
	public int Dequeue() throws Exception {
		
		if(this.is_empty()) {
			throw new Exception("Queue abhi khali hai, koi element remove nahi kr sakte");
		}
		int item = this.arr[this.front]; // item nikal rahe hai front se
		this.size--; // ek element nikal liya toh size bhi toh kmm kr de
		this.front= (this.front+1)%arr.length; // uske baad front ko ek aage kr do.
		return item;
	}
	
	public int size() {
		return this.size;
	}
	public void Display() { // complete queue mein kya hai, sara print karvana hai
		for (int i = 0; i < this.size; i++) {
			
			int idx = (this.front+i)%this.arr.length;
			System.out.print(this.arr[idx]+ "->");
		}
		System.out.println(".");

}
}
