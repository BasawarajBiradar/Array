package arraysRecurtion;

public class ArraysHwQue25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,7,90,20,5,50,40};
		int k=3;
		double min=Integer.MAX_VALUE;
		min=averageLoop(k,min,a,0);
		System.out.println(min);
	}
	private static double averageLoop(int k, double min, int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length-2) {
			int sum=0;
			int j=i;
			sum=sumLoop(sum,a,i,j,k);
			double average=(sum*1.0/k);
			if(average<min)
				min=average;
			return averageLoop(k, min, a, i+1);
		}return min;
	}
	private static int sumLoop(int sum, int[] a, int i, int j, int k) {
		// TODO Auto-generated method stub
		if(j<i+k) {
			sum=sum+a[j];
			return sumLoop(sum, a, i, j+1, k);
		}
		return sum;
	}
}
