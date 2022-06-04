package questions;

import java.util.HashMap;

public class HAshmaap {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
	map.put("Khushboo", 100);
	map.put("Pinki", 100);
	map.put(null,10);
	System.out.println(map);
	System.out.println(map.get("Khushboo"));
	
}
}
