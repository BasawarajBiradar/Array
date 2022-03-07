package arraysRecurtion;

import java.util.Arrays;
import java.util.Scanner;//incomplete;

public class ArraysHwQue03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,8,5,6,7,8,9};
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number to be removed");
		int num=sc.nextInt();
		int count=0;
		count=counterMethod(a,num,count,0);
		System.out.println(count);
		int b[]=new int[a.length-count];
		int index=0;
		insertingElements(a,b,index,num,0);
		pringtingArrayb(b,0);
	}
	private static void pringtingArrayb(int[] b, int i) {
		// TODO Auto-generated method stub
		if(i<b.length) {
			System.out.print(b[i]+" ");
			pringtingArrayb(b, i+1);
		}	
	}
	private static void insertingElements(int[] a, int[] b, int index, int num, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int count=0;
			count=insertingElelmentsJLoop(count,a,b,num,i,0);
			if(count==0)
				b[index++]=a[i];
			insertingElements(a, b, index, num, i+1);
		}	
	}
	private static int insertingElelmentsJLoop(int count, int[] a, int[] b, int num,int i,int j) {
		// TODO Auto-generated method stub
		if(j<b.length) {
			if(a[i]==num)
				count++;
			return insertingElelmentsJLoop(count, a, b, num, i, j+1);
		}
		return count;
	}
	private static int counterMethod(int[] a, int num, int count, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if(a[i]==num) 
				count++;
			return counterMethod(a, num, count, i+1);
		}
		return count;
	}
}


//for(int i=0;i<a.length;i++)
//{
//	if(a[i]==num)
//	{
//		a[i]=0;
//		int  j=i;
//		while(j<a.length-1) {
//		int temp=a[j];
//		a[j]=a[j+1];
//		a[j+1]=temp;
//		j++;
//		}
//	}
//}
//for(int i=0;i<a.length;i++) {
//	System.out.print(a[i]+" ");