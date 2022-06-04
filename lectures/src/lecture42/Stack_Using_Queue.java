package lecture42;
import lecture41.Dynamic_Queue;
public class Stack_Using_Queue {
	private Dynamic_Queue Primary;
	private Dynamic_Queue Helper;

	public Stack_Using_Queue() {
		// TODO Auto-generated constructor stub
		this.Primary = new Dynamic_Queue();
		this.Helper = new Dynamic_Queue();

	}

	public boolean Is_Empty() {
		return Primary.is_empty();

	}

	public int size() {

		return this.Primary.size();
	}
// O(N)
	public void push(int item) throws Exception {

		while (!Primary.is_empty()) {
			int rv = this.Primary.Dequeue();
			this.Helper.Enqueue(rv);
		}

		this.Primary.Enqueue(item);

		while (!Helper.is_empty()) {
			int rv = this.Helper.Dequeue();
			this.Primary.Enqueue(rv);
		}
	}
	// pop O(1)
	public int pop() throws Exception {
		return this.Primary.Dequeue();
	}
	public int peek() throws Exception {
		return this.Primary.getFront();
	}

}
