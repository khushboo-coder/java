package questions;
import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> list = new ArrayList<>();
//ArrayList list1 = new ArrayList<>();
//ArrayList list2 = new ArrayList<>();

list.add(0);
list.add(2);
list.add(3);

System.out.println(list);
// get elements
int element = list.get(0);
System.out.println(element);

//add element
list.add(1,7);
System.out.println(list);

//set
list.set(0,5);
System.out.println(list);

//remove
list.remove(1);
System.out.println(list);

//size
int size = list.size();
System.out.println(size);

//loops
for (int i = 0; i < list.size(); i++) {
	System.out.print(list.get(i)+" ");
}
System.out.println();

//sorting
Collections.sort(list);
System.out.println(list);
	}

}
