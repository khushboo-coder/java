package lecture44;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
LinkedList ll = new LinkedList();
ll.addFirst(1);
ll.addFirst(2);
ll.addFirst(3);
ll.Display();
ll.addLast(4);
ll.addLast(5);
ll.addLast(6);
ll.Display();
ll.AddatIndex(0, 90);
ll.Display();
//ll.AddatIndex(8, 0);
System.out.println(ll.GetFirst());
System.out.println(ll.GetLast());
	}

}
