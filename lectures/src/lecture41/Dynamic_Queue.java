package lecture41;
import lecture40.Queue;
public class Dynamic_Queue extends Queue {
	@Override
	
	public void Enqueue(int item) throws Exception {
	if(this.is_full())	{
		int [] newarr = new int [2*this.arr.length];
		
		for (int i = 0; i < this.arr.length; i++) {
			
			int idx = (this.front+i)%this.arr.length;
			newarr[i] = arr[idx];
		}
		this.arr=newarr;
		this.front=0;

 	}
	super.Enqueue(item);

		
 	}
	}


