package questions;

public class GasStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] gas  = {1,2,3,4,5};
int [] cost = {3,4,5,1,2};
System.out.print(Gas(gas, cost)+" ");
	}
public static int Gas(int [] gas, int [] cost) {
	int net = 0;
	int curr = 0;
	int si = 0;
	for (int i = 0; i < cost.length; i++) {
		net = net + (gas[i]-cost[i]);
		curr = curr + (gas[i]-cost[i]);
		
		if(curr<0) {
			si = i+1;
			curr = 0;
		}

	}
	if(net<0) {
		return -1;
	}
	return si;
}
}
