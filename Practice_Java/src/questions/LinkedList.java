package questions;
public class LinkedList {
	public class Node{
		int data;
		Node next;
		
		public Node(int item) {
			this.data = item;
		}
public Node() {
	
}
	}
	
	int size;
	Node head;
	Node tail;

	
	public void addFirst(int item) {
		Node nn = new Node(item);

		if(this.size==0) {
			this.head = nn; //head pe nn rakha
			this.tail = nn; //tail pe bhi nn rakha
			this.size++; //fir size inc kr diya
		}
		else {
		nn.next = this.head; // nn ke next mein jo null rakha tha, us mein head ka address rakh de	
		this.head = nn; // head mein nn ka address rakh de   head nn pe aa gya
		this.size++;
		}
	}
	public void addLast(int item) {
		if(this.size==0) {
			this.addFirst(item);
		}
		Node nn = new Node();
		this.tail.next = nn;
		this.tail=nn;
		this.size++;
		
	}
	private Node GetNode(int k) throws Exception {
		if(k<0 || k>=this.size) {
			throw new Exception("k ke size jitna hi ho sakta hai");
		}
		
		Node temp = this.head;
		for (int i = 1; i <= k; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void AddatIndex(int k, int item) throws Exception {

		if (k == 0) {
			this.addFirst(item);
		} else if (k == this.size) {
			this.addLast(item);
		} else {
			Node nn = new Node(item);
			Node before = GetNode(k - 1);
			nn.next = before.next;
			before.next = nn;
			this.size++;

		}

	}
	public int GetFirst() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linkedlist khaali hai pgl data kyu Access kr rahe ho ");
		}

		return this.head.data;

	}
	public int GetLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("Linkedlist khaali hai pgl data kyu Access kr rahe ho ");
		}

		return this.tail.data;

	}
	public int GetAtAnyIndex(int k) throws Exception {

		if (this.size == 0) {
			throw new Exception("Linkedlist khaali hai pgl data kyu Access kr rahe ho ");
		}

		return this.GetNode(k).data;

	}

	public int RemoveFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("Pgl hai kya ");
		}

		int rv = this.head.data;

		if (this.size == 1) {
			this.head = null;
			this.tail = null;
			this.size--;
		} else {
			Node temp = this.head;
			this.head = this.head.next;
			temp.next = null;
			this.size--;
		}
		return rv;

	}

	public int RemoveLast() throws Exception {

		if (this.size == 0) {
			throw new Exception("Pgl hai kya ");
		}

		else if (this.size == 1) {
			return this.RemoveFirst();
		}

		else {
			Node sl = GetNode(this.size - 2);
			int rv = sl.next.data;
			sl.next = null;
			this.tail = sl;
			this.size--;
			return rv;

		}

	}

	public int RemoveatAnyIndex(int k) throws Exception {

		if (k < 0 || k >= this.size) {
			throw new Exception("Index Out of Bound");

		}
		if (k == 0) {
			return this.RemoveFirst();
		} else if (k == this.size - 1) {
			return this.RemoveLast();
		} else {
			Node k_1 = GetNode(k - 1);// 2k
			Node kth = GetNode(k);// 3k
			k_1.next = kth.next;
			kth.next = null;
			this.size--;
			return kth.data;

		}

	}

	public void display() {
		Node temp = this.head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
}
