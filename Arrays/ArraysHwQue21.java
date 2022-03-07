package arraysRecurtion;

import java.util.Arrays;

public class ArraysHwQue21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {
				{1,2,3},
				{1,2,3}};
		int b[][]= {
				{1,1},
				{1,1},
				{1,1}};
		System.out.println(a.length+" "+ b[0].length);
		int c[][]=new int [a.length][b[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				for(int k=0;k<b.length;k++) {
				c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(c));
	}

}
