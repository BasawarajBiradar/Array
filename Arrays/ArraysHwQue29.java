package arraysRecurtion;

public class ArraysHwQue29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,1,3,4,7}; 
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		loopSum(a,0);
	}

	private static void loopSum(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int j=i+1;
			loopSumj(a,i,j);
		}
		
	}

	private static void loopSumj(int[] a, int i, int j) {
		// TODO Auto-generated method stu
			if(j<a.length) {
				int k=j+1;
				loopSumK(a, i, j,k);
				loopSumj(a, i, j+1);
			}
		}

	private static void loopSumK(int[] a, int i, int j, int k) {
		// TODO Auto-generated method stub
		if(k<a.length) {
			if(a[i]+a[j]+a[k]<12)
				System.out.println(a[i]+" "+a[j]+" "+a[k]);
			loopSumK(a, i, j, k+1);
		}
	}
		
	}

