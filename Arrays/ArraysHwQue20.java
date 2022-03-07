package arraysRecurtion;

import java.util.Arrays;

public class ArraysHwQue20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3},
				{1,2,3},
				{1,2,3}};
		int b[][]= {
				{1,1,1},
				{1,1,1},
				{1,1,1}};
		int c[][]=new int [3][3];
		int d[][]=new int [3][3];
		loopAdditionI(a,b,c,0);
		loopSubI(a,b,d,0);
		System.out.println(Arrays.deepToString(c));
		System.out.println(Arrays.deepToString(d));
	}
	private static void loopSubI(int[][] a, int[][] b, int[][] d, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			loopSubj(a, b, d, i,0);	
			loopSubI(a, b, d, i+1);
		}
	}
	private static void loopSubj(int[][] a, int[][] b, int[][] d, int i, int j) {
		// TODO Auto-generated method stub
		if(j<a.length) {
				d[i][j]=a[i][j]-b[i][j];
			loopSubj(a, b, d, i, j+1);
		}
	}
	private static void loopAdditionI(int[][] a, int[][] b,int c[][], int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			loopAdditionJ(a, b, c, i,0);
			loopAdditionI(a, b,c, i+1);
		}
	}
	private static void loopAdditionJ(int[][] a, int[][] b, int[][] c, int i, int j) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			c[i][j]=a[i][j]+b[i][j];
			loopAdditionJ(a, b, c, i, j+1);
		}
	}
}
