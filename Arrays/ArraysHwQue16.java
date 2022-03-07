package arraysRecurtion;

import java.util.Arrays;

public class ArraysHwQue16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		loopI(a,0);
		System.out.println(Arrays.toString(a));
	}
	private static void loopI(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			for(int j=a.length-1;j>i;j--) {
				if(a[i]%2!=0 && a[j]%2==0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			loopI(a, i+1);
		}	
	}
}
