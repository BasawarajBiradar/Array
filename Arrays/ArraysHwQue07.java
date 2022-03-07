package arraysRecurtion;

import java.util.Arrays;

public class ArraysHwQue07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,7,4,5,6,3,2,1};
		loopI(a,0);
		System.out.println(Arrays.toString(a));
	}
	private static void loopI(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			loopJ(a,i,i+1);
			loopI(a, i+1);
		}
	}
	private static void loopJ(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if(a[i]>a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			loopJ(a, i, j+1);
		}	
	}
}
