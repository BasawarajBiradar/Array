package arraysRecurtion;

public class ArraysHwQue08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5,8,6,3,9,7};
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		max=loopMax(a,max,0);
		//System.out.println(max);
		max2=loopSecondMax(a,max,max2,0);
		System.out.println("Second max= "+max2);
	}
	private static int loopSecondMax(int[] a, int max,int max2, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if(a[i]!=max && a[i]>max2) {
				max2=a[i];
			}
			return loopSecondMax(a, max,max2, i+1);
		}
		return max2;
	}
	private static int loopMax(int[] a, int max, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if(a[i]>max) {
				max=a[i];
			}
			return loopMax(a, max, i+1);
		}return max;	
	}
}
