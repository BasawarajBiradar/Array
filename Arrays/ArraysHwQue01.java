package arraysRecurtion;

import java.util.Scanner;

public class ArraysHwQue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number to be found");
		int num=sc.nextInt();
		loop(a,num,0);
		}

	private static void loop(int[] a, int num, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if(a[i]==num)
				System.out.println("index = "+i);
			loop(a, num, i+1);
		}
		
	}

}
