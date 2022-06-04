package questions;
import java.util.*;
public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] gas = new int [n];
		for (int i = 0; i < gas.length; i++) {
			gas[i]= sc.nextInt();
		}
		int m = sc.nextInt();
		int [] cost = new int [m];
		for (int i = 0; i < cost.length; i++) {
			cost[i] = sc.nextInt();
		}
		System.out.println(gas_station(gas,cost));
	}
	public static int gas_station(int [] cost, int [] gas) {
		int net = 0;
		int curr = 0; // current fuel
		int si = 0; // starting index
		for (int i = 0; i < gas.length; i++) {
			net = net + cost[i] - gas[i];
			curr = curr + cost[i] - gas[i];


			if(curr<0) {
				si=i+1;
				curr = 0;
			}

		}
		if(net<0) {
			return -1;
		}

		return si;
	}
}
