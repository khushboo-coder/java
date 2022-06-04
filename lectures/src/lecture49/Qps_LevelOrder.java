package lecture49;
import lecture48.Binary_Tree;
public class Qps_LevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_Tree bt = new Binary_Tree();
		// 10 true 20 true 30 false true 50 false false true 60 false false true 70 true 90 false false true 110 false false
				bt.display();
				bt.levelOrder();
				System.out.println();
				bt.levelOrderLinewise();


	}

}
