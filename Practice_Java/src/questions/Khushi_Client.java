package questions;

public class Khushi_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Khushi k = new Khushi();
k.age = 22;
k.name = "Khushboo Chopra";
k.single = true;
System.out.println(k.name);

Khushi h = new Khushi ();
h.age = 28;
h.name = "Harshita";
h.single = true;
System.out.println(h.name);
h.introYourself();
k.introYourself();
h.say("Khushboo");
	

}
}
