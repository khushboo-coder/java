package questions;

public class StringBuilders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder str = new StringBuilder("Tony");
System.out.println(str);

System.out.println(str.charAt(0));
str.setCharAt(0, 'P');
System.out.println(str);
str.insert(0, 'S');
System.out.println(str);
str.insert(3, 'n');
System.out.println(str);
str.delete(0, 1);
System.out.println(str);
StringBuilder sb = new StringBuilder ("T");
sb.append('o');
sb.append('n');
sb.append('n');
sb.append("ye");
System.out.println(sb);
System.out.println(sb.length());
sb.reverse();
System.out.println(sb);


	}

}
