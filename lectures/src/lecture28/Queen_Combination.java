package lecture28;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board = new boolean[4];
		permutation(board,2,0,"",-1);
			}
		public static void permutation(boolean [] board, int tq, int qpsf, String ans,int last_idx) {
			for (int i = last_idx+1; i < board.length; i++) {
				if(tq==qpsf) {// tq (total queen), qpsf(queen placed so far)
					System.out.println(ans);
					return;
				}
				if(!board[i]) {//false
				board[i]=true;
				permutation(board, tq, qpsf+1, ans+"b"+i+"Q"+qpsf,i);
				board[i]=false;
				}
			}

	}

}
