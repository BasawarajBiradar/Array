package arraysRecurtion;

public class ArraysHwQue19 {

	static int totalSum=0;
	static int totalCnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3,4},
				{4,5,6,7},
				{7,8,9,4},
				{1,2,3,4}};
		int sum=0;
		int count=0;
		int b[]=new int [2];
		loopI(a,b,count,sum,0);
		sum=totalSum;
		count=totalCnt;
		System.out.println("average= "+(totalSum/totalCnt));
	}
   private static void loopI(int[][] a,int b[], int count, int sum, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			b=loopj(a, b, count, sum, i,0);
			 totalSum=totalSum+b[0];
			 totalCnt=totalCnt+b[1];
			loopI(a,b, count, sum, i+1);
		}	
	}
private static int[] loopj(int[][] a, int[] b, int count, int sum, int i, int j) {
	// TODO Auto-generated method stub
	if(j<a[i].length) {
		if(i==0|| i==3|| j==0|| j==3){}
		else {
			sum=sum+a[i][j];
			count++;
		}
		return loopj(a, b, count, sum, i, j+1);
	}b[0]=sum;
	b[1]=count;
	return b;
}
}
