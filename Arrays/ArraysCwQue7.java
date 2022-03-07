package arraysRecurtion;

import java.util.Arrays;

public class ArraysCwQue7 {

	public static void main(String[] args)
	{
		int a[]= {1, 1, 2};
		int count=0;
		count=dupCountLoop(count,a,0);
		int index=0;
		int unique[]= new int [a.length-count];
		unique=uniqueArrayLoop(unique,a,index,0);
		uniquePairPrinting(unique,0);	
	}
	private static void uniquePairPrinting(int[] unique, int i)
	{
		if(i<unique.length) {
			uniquePairPrintingJ(unique, i,0);
			uniquePairPrinting(unique, i+1);
		}	
	}
	private static void uniquePairPrintingJ(int[] unique, int i, int j)
	{
		if(j<unique.length) {
			System.out.println("("+unique[i]+","+unique[j]+")");
			uniquePairPrintingJ(unique, i, j+1);
		}	
	}
	private static int[] uniqueArrayLoop(int[] unique, int[] a, int index,int i) 
	{
		if(i<a.length) {
			int count=0;
			count=uniqueArrayLoopJ(unique, a, i,count,0);
			if(count==0)
				unique[index++]=a[i];
			return uniqueArrayLoop(unique, a,index, i+1);
		}
		return unique;
	}
	private static int uniqueArrayLoopJ(int[] unique, int[] a, int i, int count, int j) 
	{
		if(j<unique.length) {
		
			if(a[i]==unique[j])
				count++;
			return uniqueArrayLoopJ(unique, a, i, count, j+1);
		}
		return count;
	}
	private static int dupCountLoop(int count, int[] a, int i)
	{
		if(i<a.length) {
			count =dupCountLoopJ(count, a, i,i+1);
			return dupCountLoop(count, a, i+1);
		}
		return count;
	}
	private static int dupCountLoopJ(int count, int[] a, int i, int j)
	{
		if(j<a.length) {
			if(a[i]==a[j])
				count++;
			return dupCountLoopJ(count, a, i, j+1);
		}
		return count;
	}


}
