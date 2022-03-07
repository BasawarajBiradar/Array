package arraysRecurtion;

public class ArraysHwQue14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,6,4,5,2,3,1};
		loopI(a,0);
	}
	private static void loopI(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length){
			int count=0;
			count=loopJ(count,a,i,i+1);
			if(count==0)
				System.out.println(a[i]);
			loopI(a, i+1);
		}	
	}
	private static int loopJ(int count, int[] a, int i,int j) {
		// TODO Auto-generated method stub
		if(j<a.length) {
			if(a[i]<a[j]) {
				count++;
				return count;
				}
			return loopJ(count, a, i,j+1);
		}
		return count;
	}
}
