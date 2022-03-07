package arraysRecurtion;

public class ArraysCwQue6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]={{1,2,3},
				{4,5,6}};
		
		int b[][]= new int [a[0].length][a.length];
		transposeMethod(a,b,0);
		for(int i=0;i<b.length;i++) {
		  for(int j=0;j<b[i].length;j++) {
			  System.out.print(b[i][j]+" ");
		  }System.out.println(); 
		}
	}

	private static void transposeMethod(int[][] a, int[][] b, int i) {
		// TODO Auto-generated method stub
		if(i<b.length) {
			innerTranspose(a,b,i,0);
			transposeMethod(a, b, i+1);
		}
	}

	private static void innerTranspose(int[][] a, int[][] b, int i, int j) {
		// TODO Auto-generated method stub
		if(j<b[i].length) {
			b[i][j]=a[j][i];
			innerTranspose(a, b, i, j+1);
		}
	}

}
