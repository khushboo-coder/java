package lecture41;
import lecture40.Stack;
public class DynamicStack extends Stack {
@Override
public void push(int item) throws Exception {
	if(this.is_full()) {
		int [] newarr = new int [2*this.arr.length];
		for (int i = 0; i < this.arr.length; i++) {
			newarr[i]=this.arr[i];
		}
		this.arr=newarr;
 	}
	super.push(item);
}
	
}
