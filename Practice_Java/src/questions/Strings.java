package questions;
import java.util.*;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// String Declaration
		//Scanner sc = new Scanner(System.in);
		//String Name = sc.nextLine();
		//System.out.println("Your name is " + Name);
		String name = "Khushboo";
		String fullName = "Khushboo Chopra";
		String Sentence = "My name is Khushboo Chopra";
		
		//concatenation
		String firstName = "Tony";
		String lastName = "Stark";
		String full = firstName +" @ " + lastName;
		System.out.println(full);
		System.out.println(full.length());
		
		for (int i = 0; i < full.length(); i++) {
			System.out.print(full.charAt(i)+ " ");
		}
		System.out.println();
		
		String name1 = "Sahil";
		String name2 = "Sahil";
		
		//s1>s2 == +ve value
		//s1 == s2 0 value
		// s1<s2 -ve value
		
		if(name1.compareTo(name2) == 0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		if(new String ("Tony") == new String ("Tony")) {
		System.out.println("Strings are same");
		}
		else {
			System.out.println("Strigs are different");
		}
		
		//substrings
		String sentence = "My name is Tony";
		System.out.println(sentence.substring(11, sentence.length()));
		
		//strings are immutable
		
	}

}
