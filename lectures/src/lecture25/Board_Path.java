package lecture25;

public class Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ans = print_board_path(10, 0, "");
System.out.println(ans);
	}
public static int print_board_path(int end, int curr, String ans) {
	//Base Case
	if(curr==end) {
		System.out.println(ans);
		return 1;
	}
if(curr>end) {
	return 0;
}
//print_board_path(end, curr+1, ans+"1");
//print_board_path(end, curr+2, ans+"2");
//print_board_path(end, curr+3, ans+"3");
//print_board_path(end, curr+4, ans+"4");
//print_board_path(end, curr+5, ans+"5");
//print_board_path(end, curr+6, ans+"6");

int count=0;
for (int dice = 1; dice <= 6; dice++) {
	count+=print_board_path(end, curr + dice, ans + dice);

}
return count;


}
}
