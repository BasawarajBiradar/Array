package arraysRecurtion;

public class ArraysHwQue15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,4,3};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int b[]=new int[2];
		b=maxLoop(max,min,a,b,0);
		max=b[0];
		min=b[1];
		System.out.println("difference between max & min = "+(max-min));
	}
	private static int[] maxLoop(int max, int min, int[] a, int[] b, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
			b[0]=max;
			b[1]=min;
			return maxLoop(max, min, a, b, i+1);
		}
		return b;
	}

}
