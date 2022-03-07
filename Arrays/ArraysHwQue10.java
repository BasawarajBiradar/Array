package arraysRecurtion;

public class ArraysHwQue10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int max=Integer.MIN_VALUE;
		max=loopMax(a,0,max);
		System.out.println(max);
	}
	private static int loopMax(int[][] a, int i,int max) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			max=loopJMax(a,max,i,0);
			return loopMax(a, i+1, max);
		}
		return max;
	}
	private static int loopJMax(int[][] a, int max, int i, int j) {
		// TODO Auto-generated method stub
		if(j<a[i].length) {
			if(a[i][j]>max) {
				max=a[i][j];
			}
			return loopJMax(a, max, i, j+1);
		}
		return max;
	}
}
