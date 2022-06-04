package questions;
import java.util.*;
public class Guess_any_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = (int)(Math.random()*100);
int guess;
System.out.println("Guess a num between 1 to 100");
for (int i = 0; i >=0; i++) {
	guess = sc.nextInt();
	if(guess==num) {
		System.out.println("WOHOO..your guess is correct");
		break;
	}
	else if(guess<num) {
		System.out.println("Your num is too small");
	}
	else {
		System.out.println("Your num is too large");
	}
}
System.out.println("My num was "+ num);
	}

}
