package lecture28;

public class Queen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean [] board = new boolean[4];
permutation(board,2,0,"");
	}
public static void permutation(boolean [] board, int tq, int qpsf, String ans) {
	for (int i = 0; i < board.length; i++) {
		if(tq==qpsf) {// tq (total queen), qpsf(queen placed so far)
			System.out.println(ans);
			return;
		}
		if(!board[i]) {//false
		board[i]=true;
		permutation(board, tq, qpsf+1, ans+"b"+i+"Q"+qpsf);
		board[i]=false;
		}
	}
}
}
