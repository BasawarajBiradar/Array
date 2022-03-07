package arraysRecurtion;

import java.util.Arrays;

public class ArraysHwQue11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,1,5,6,6,5,8,3,9,4,8,8,9,3,7,7,5,1,2,4,5,6,1};
		int count=0;
		count=Countloop(count,a,0);
		int index=0;
		int unique[]=new int[a.length-count];
		unique=uniqueLoopI(unique,a,index,0);
		System.out.println(Arrays.toString(unique));
	}
	private static int[] uniqueLoopI(int[] unique, int[] a, int index, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int count=0;
			count=uniqueLoopj(unique,count, a, i,0);
			if(count==0)
				unique[index++]=a[i];
			return uniqueLoopI(unique, a, index, i+1);
		}
		return unique;
	}
	private static int uniqueLoopj(int[] unique,int count, int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(j<unique.length) {
			if(a[i]==unique[j])
				count++;
			return uniqueLoopj(unique,count, a, i, j+1);
		}
		return count;
	}
	private static int Countloop(int count, int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			count=CountLoopJ(count,a,i,i+1);
			return Countloop(count, a, i+1);
		}
		return count;
	}
	private static int CountLoopJ(int count, int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if(a[i]==a[j]) {
				count++;
				return count;
			}
			return CountLoopJ(count, a, i, j+1);
		}
		return count;
	}
}
