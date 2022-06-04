package lecture27;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lexico_counting(0, 1000);
	}
public static void lexico_counting(int curr, int end) {
if(curr>end) {
	return;
}
System.out.println(curr);
int i = 1;// jab curr!=0 hai toh 10 recursive call karni hai, from 0 to 9
if(curr==0) { // curr 0 pe hai toh 9 recursive call lagani  hai, 1 to 9
	i=1;
}
for (; i <=9; i++) {
	lexico_counting(curr*10+i, end);
}
}
}
