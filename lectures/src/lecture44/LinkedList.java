package lecture44;

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
private Node head;
private Node tail;
private int size;

/*public void addFirst(int item) {
	Node nn = new Node(item);
	if(this.size==0) {
		this.head = nn;
		this.tail = nn;
		this.size++;
	}
	else {
		nn.next = this.head;
		this.head = nn;
		this.size++;
	}
}*/

public void addFirst(int item) {
	Node nn = new Node(item);

	if (this.size == 0) {
		this.head = nn;
		this.tail = nn;
		this.size++;

	} else {
		nn.next = this.head;// 1k
		this.head = nn;
		this.size++;

	}

}


/*public void addLast(int item) {
	if(this.size==0) {
		this.addFirst(item);
	}
	else {
		Node nn = new Node(item);
		this.tail.next = nn;
		this.tail = nn;
		this.size++;
	}
}*/

public void addLast(int item) {

	if (this.size == 0) {
		this.addFirst(item);
	} else {
		Node nn = new Node(item);
		this.tail.next = nn;
		this.tail = nn;
		this.size++;

	}

}


/*public void Display() {
	Node temp = this.head;
	
	while(temp!= null) {
		System.out.print(temp.data + "--> ");
		temp = temp.next;
	}
	System.out.println(".");
}*/

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
public void Display() {
	Node temp = this.head;
	while (temp != null) {
		System.out.print(temp.data + "-->");
		temp = temp.next;

	}
	System.out.println(".");
}

// lecture 45
public void dataReverseI() throws Exception { // iterative method, is mein only data reverse krna tha, address same rakhna tha
	int left = 0; // ek left pointer bnaya
	int right = this.size-1; // ek right pointer bnaya
	while(left<right) { /// jaise array reverse krte hai vaise hi krege
		Node Left_Node = GetNode(left);  // get node ke code se left node nikal liya
		Node Right_Node = GetNode(right); // get node ke code se right node nikal liya
		int t = Left_Node.data;
		Left_Node.data = Right_Node.data; // swap ka code likhege
		Right_Node.data = t;
		left++;
		right--;
		
	}
	
}
public void pointerReverseI() {
Node prev = null;	
Node curr = this.head;

while(curr!=null) {
	Node ahead = curr.next; // ahead mein curr ka address yaad rakh liya
	curr.next = prev; // curr mein pre ka address rakh diya
	prev = curr; // curr ki position pe pre aa gya
	curr = ahead; // ahead vale address pe curr aa gya
	}
Node temp = this.head; // head and tail ki swappingg krvani thi
this.head = this.tail;
this.tail = temp;
}
public void PointerReverseRecursive() { // function overloading ka concept use kiya
	PointerReverseRecursive(this.head, null);
	Node temp = this.head; // head and tail ki swapping krvani thi
	this.head = this.tail;
	this.tail = temp;
	
	
}


private void PointerReverseRecursive (Node curr, Node prev) { // main function client ko show nhi kr sakte na, link reverse krna hai
	// base case
	if(curr==null) {
		return;
	}
	PointerReverseRecursive(curr.next, curr);
	curr.next = prev;
}
public void DataReverseRecursive() {
	HeapMover mover = new HeapMover();
	mover.Left = this.head;
	DataReverseRecursive(head, mover, 0);
}
	
	public class HeapMover{
		Node Left;
	}
		
	
	
	//DataReverseRecursive(head, head, 0);

private void DataReverseRecursive(Node curr, HeapMover mover, int count) { // data reverse krna hai
	// base case
	if(curr==null) {
		return;
	}

	DataReverseRecursive(curr.next, mover, count+1);
	if(count>=this.size/2) {
		int t = mover.Left.data;
		mover.Left.data = curr.data;
		mover.Left.data = t;
		mover.Left = mover.Left.next;
	}
}
public int mid() { // slow-fast pointer
	Node slow = this.head;
	Node fast = this.head;
	while (fast.next != null && fast.next.next != null) {
		fast = fast.next.next;
		slow = slow.next;
	}
	return slow.data; //slow.data is the mid

}
public int kthfromend(int k) {
	return kthfromend(k, this.head);

}

private int kthfromend(int k, Node nn) {
	// TODO Auto-generated method stub
	// fast ko k step chalo do
	Node fast = nn;
	for (int i = 1; i <= k; i++) {
		fast = fast.next;

	}
	Node slow = nn;
	while (fast != null) {
		slow = slow.next;
		fast = fast.next;
	}

	return slow.data;
}

public void create_Cycle() throws Exception {
	Node nn = GetNode(2);
	this.tail.next = nn;

}

public boolean FloyedCycledetcion() {
	Node fast = this.head;
	Node slow = this.head;
	while (fast.next != null && fast.next.next != null) {
		fast = fast.next.next;
		slow = slow.next;
		if (slow == fast) {
			return true;
		}
	}

	return false;

}

private Node GetCycleNode() {
	Node fast = this.head;
	Node slow = this.head;
	while (fast.next != null && fast.next.next != null) {
		fast = fast.next.next;
		slow = slow.next;
		if (slow == fast) {
			return slow;
		}
	}

	return null;

}

public void CycleRemoval1() {

	Node meetup = GetCycleNode();
	if (meetup == null) {
		return;
	}
	Node start = this.head;
	while (start != null) {

		Node temp = meetup;
		while (temp.next != meetup) {
			if (temp.next == start) {
				temp.next = null;
				return;
			}
			temp = temp.next;
		}
		start = start.next;

	}

}

public void CycleRemoval2() {
	Node meetup = GetCycleNode();
	if (meetup == null) {
		return;
	}
	// Count Number of Node in a loop
	int count = 1;
	Node temp = meetup;
	while (temp.next != meetup) {
		count++;
		temp = temp.next;
	}
	Node fast = this.head;
	for (int i = 1; i <= count; i++) {
		fast = fast.next;
	}
	Node slow = this.head;
	while (slow.next != fast.next) {
		slow = slow.next;
		fast = fast.next;
	}

	fast.next = null;

}

public void FloyedCycleRemoval() {
	Node meetup = GetCycleNode();
	if (meetup == null) {
		return;
	}
	Node temp = meetup;
	Node start = this.head;
	while (start.next != temp.next) {
		start = start.next;
		temp = temp.next;
	}
	temp.next = null;

}

}
