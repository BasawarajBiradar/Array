package arraysRecurtion;

import java.util.Arrays;

public class ArraysHwQue05_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,7,4,5,6,3,2,1};
		loopI(a,0);
		System.out.println(Arrays.toString(a));
	}
	private static void loopI(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int j=a.length-1;
			loopJ(a,i,j);
			loopI(a, i+1);
		}
	}
	private static void loopJ(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(j>i) {
			if(a[i]>a[j])
			{
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			}	
			loopJ(a, i, j-1);
		}
	}
}
