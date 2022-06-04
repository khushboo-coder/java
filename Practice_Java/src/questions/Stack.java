package questions;

public class Stack {
	private int [] arr;
	int top;

	//constructor
	public Stack() {
		this.arr = new int [5];
		this.top = 0;
	}

	public Stack(int cap) { //capacity
		this.arr = new int [cap];
		this.top = 0;
	}
	public boolean isEmpty() {
		return this.top==0;
	}

	public boolean isFull() {
		//jab top arr.length ke equal ho gya toh it means stack full ho gya
		return this.top==this.arr.length;

	}
	public void push(int item) throws Exception {
		if(this.isFull()) {
			throw new Exception("Stack is full");
		}
		this.arr[this.top]=item;
		top++;
	}
	public int pop() throws Exception {
		if(this.top==0){
			throw new Exception("Stack is empty");
		}
		top--;// pehle top ko piche krege
		int item = this.arr[top]; //fir us value ko item mein yaad rakhege
		this.arr[top] = 0;
		return item;}

	public int peek() throws Exception {
		if(this.top==0){
			throw new Exception("Stack is empty");
		}

		int item = this.arr[top-1];
		return item;
	}
	
	public int size() {
		return top;
	}
	public void display() {
		for (int i = 0; i <top; i++) {
		System.out.print(this.arr[i]+"->");	
		}
		System.out.println(".");
	}

}


