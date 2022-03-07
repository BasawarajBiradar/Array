package arraysRecurtion;

import java.util.Arrays;

public class ArraysHwQue28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[]= {1,1,1,1,1,2,2,3,4};
		int a[]= {1,2,4};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}
			}
			if(count>2)
				count=2;
			int newB[]=new int[b.length-count];
			count=0;
			int index=0;
			for(int j=0;j<b.length;j++) {
			if(b[j]==a[i] && count<2)
				count++;
			else
				newB[index++]=b[j];
			}
			b=newB;
		}
		 System.out.println(Arrays.toString(b));
	}

}
