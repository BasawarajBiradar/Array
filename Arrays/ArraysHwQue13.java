package arraysRecurtion;

public class ArraysHwQue13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		int count=0;
		if(a.length==b.length) {
			count=loopI(a,b,0,count);
		if(count==0)
			System.out.println(true);
		else
			System.out.println(false);
		}
		else
			System.out.println(false);
	}
	private static int loopI(int[] a, int[] b, int i, int count) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			if(a[i]!=b[i]) {
				count++;
				return count;
		 }
			return loopI(a, b, i+1, count);
		}
		return count;
	}
}
