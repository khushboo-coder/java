package lecture28;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
print_path(0, 0, 2, 2, "");
	}
public static void print_path(int cc, int cr, int ec, int er,String ans) {
	// base case
	if(cc==ec && cr==er) {
		System.out.println(ans);
		return;
	}
	if(cr>er || cc>ec) {
		return;
	}
	print_path(cc+1, cr, ec, er,ans+ "H");
	print_path(cc,cr+1,ec,er,ans+"V");
}
}
