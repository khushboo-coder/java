package lecture52;

public class BinarySearchTree {
public class Node{
	int data;
	Node left;
	Node right;
}
private Node root;

public BinarySearchTree(int [] arr) {
	this.root = CreateTree(arr,0,arr.length-1);
	
}
private Node CreateTree(int[] arr, int si, int ei) {
	if(si>ei) {
		return null;
	}
int mid = (si+ei/2);
Node nn = new Node();
nn.data = arr[mid];
nn.left = CreateTree(arr, si, mid - 1);
nn.right = CreateTree(arr, mid + 1, ei);
return nn;

}

public void preOrder() {
preOrder(this.root);
System.out.println();
}

private void preOrder(Node node) {
// TODO Auto-generated method stub
if (node == null) {
	return;
}
System.out.print(node.data+" ");
preOrder(node.left);
preOrder(node.right);

}


}

