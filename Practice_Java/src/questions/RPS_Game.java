package questions;
import java.util.Random;
import java.util.Scanner;

public class RPS_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Random r = new Random();
System.out.println("0 for rock, 1 for paper, 2 for scissor");
int userInput = sc.nextInt();
int compInput = r.nextInt(3);
if(userInput==compInput) {
	System.out.println("Match Draw");
}
else if(userInput==0 && compInput == 2 || userInput==1 && compInput ==0 || userInput ==2 && compInput ==1) {
	System.out.println("WOW! You Win");
}
else {
	System.out.println("OHH, You Loose");
}
if(compInput==0) {
	System.out.println("Computer choice : Rock");
}
else if(compInput==1) {
	System.out.println("Computer choice : Paper");
}
else {
	System.out.println("Computer choice : Scissor");
}
	}

}
