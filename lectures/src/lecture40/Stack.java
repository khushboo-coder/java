package lecture40;

public class Stack {
	
protected int [] arr;
private int top;

public Stack() { // client ne value nhi btayi toh humne default value de di
	this.arr = new int [5];
	this.top = 0;
}

public Stack(int cap) { // client agr value dega toh hum cap mein save karvayege
	this.arr = new int [cap];
	this.top = 0;

}
public boolean is_empty(){
	return this.top==0;
}

public boolean is_full(){
	return this.top==this.arr.length;
}

public void push(int item) throws Exception {
	
	if(this.is_full()) {
		throw new Exception("pagal hai kya stack full hai");
	}
	this.arr[this.top]= item;
	top++;
}

public int pop() throws Exception {
	if(this.is_empty()) {
		throw new Exception("sun bhai jb stack khali hai toh data pop kyu karni hai");
	}
	this.top--;
	int item = this.arr[top];
	this.arr[top]= 0;
	return item;
	
	
}
public int peek() throws Exception{
	if(this.is_empty()) {
		throw new Exception("tu rehne de tere se nahi hoga");
	}

	int item = this.arr[top-1];
	return item;
}

public int size() {
	return top;
}

public void Display() { // complete stack mein kya hai, sara print karvana hai
	for (int i = 0; i < top; i++) {
		System.out.print(this.arr[i]+ "->");
	}
	System.out.println(".");
}
}
