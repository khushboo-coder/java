package lecture42;
import lecture41.DynamicStack;
public class Queue_Using_Stack {
	private DynamicStack Primary;
	private DynamicStack Helper;
	public Queue_Using_Stack() {
		// TODO Auto-generated constructor stub
		this.Primary= new DynamicStack();
		this.Helper= new DynamicStack();
	}
	
	
	public boolean is_Empty() {
		return this.Primary.is_empty();
	}
	
	public int size() {
		return this.Primary.size();
	}
	// O(1)
	public void  Enqueue(int item) throws Exception {
		this.Primary.push(item);
		
	}
	
	public int DeQueue() throws Exception {
		
		while(this.Primary.size()>1) {
			int rv = this.Primary.pop();
			this.Helper.push(rv);
		}
		int item = this.Primary.pop();
		
		while(!this.Helper.is_empty()) {
			
			int rv = this.Helper.pop();
			this.Primary.push(rv);
		}
		return item;
		
		
	}
	
	public int GetFront() throws Exception {
		while(this.Primary.size()>1) {
			int rv = this.Primary.pop();
			this.Helper.push(rv);
		}
		int item = this.Primary.peek();
		
		while(!this.Helper.is_empty()) {
			
			int rv = this.Helper.pop();
			this.Primary.push(rv);
		}
		return item;
		
		
	}

}
