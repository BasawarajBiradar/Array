package arraysRecurtion;

import java.util.Arrays;

public class ArraysCwQue5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,-2,3,4,-5,6,7,-8,9};
		
		a=loopI(a,0);
		
		System.out.println(Arrays.toString(a));

	}

	private static int[] loopI(int[] a, int i) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			a=loopJ(a,i,a.length-1);
			return loopI(a, i + 1);
		}
		return a;

	}

	private static int[] loopJ(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(j>i) {
			if (a[i] < 0 && a[j] > 0)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}			
			return loopJ(a, i, j-1);
		}
		return a;
		
	}
}