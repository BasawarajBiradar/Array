package arraysRecurtion;

import java.util.Arrays;//incomplete ;

public class ArraysCwQue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,6,3,9,7,4,2,8};
		loopI(a,0);
			System.out.println(Arrays.toString(a));	
	}
	private static int[] loopI(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int j=i;
			int temp=a[i];
			j=loopJ(a,temp,j);
			
			a[j]=temp;
			return loopI(a, i+1);
		}
		return a;
	}
	private static int loopJ(int[] a, int temp, int j) {

		if(j>0 && temp<a[j-1])
		{
			a[j]=a[j-1];
			j--;
			return loopJ(a, temp, j);
		}
		return j;
	}
}
//for(int i=0;i<a.length;i++)
//{
//	int j=i;
//	int temp=a[i];
//	while(j>0 && temp<a[j-1])
//	{
//		a[j]=a[j-1];
//		j--;
//	}
//	a[j]=temp;
//}
//
//System.out.println(Arrays.toString(a));
//}
