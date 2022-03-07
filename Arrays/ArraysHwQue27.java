package arraysRecurtion;

public class ArraysHwQue27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{6,3,1},
				{9,7,8},
				{2,4,5}
		};
		int index=-1;
		index=loopi(index,a,0);
		if(index==-1)
			System.out.println("saddle point doesnt exist");
	}
	private static int loopi(int index, int[][] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			index=loopJ(index, a, i,0);
			return loopi(index, a, i+1);
		}
		return index;	
	}
	private static int loopJ(int index, int[][] a, int i, int j) {
		// TODO Auto-generated method stub
		if(j<a[i].length) {
			boolean isSmallestInRow=true;
			isSmallestInRow=loopRow(a,i,j,isSmallestInRow,0);
			boolean isLargestInColumn=true;
			isLargestInColumn= loopCol(a,i,j,isLargestInColumn,0);
			if(isLargestInColumn && isSmallestInRow) {
				System.out.println(a[i][j]);
				index++;
			}
			return loopJ(index, a, i, j+1);
		}
		return index;
	}
	private static boolean loopCol(int[][] a, int i, int j, boolean isLargestInColumn, int k) {
		// TODO Auto-generated method stub
		if(k<a.length) {
			if(a[i][j]<a[k][j]){
				isLargestInColumn=false;
			    return isLargestInColumn;
			    }
			return loopCol(a, i, j, isLargestInColumn, k+1);
		}
		return isLargestInColumn;
	}
	private static boolean loopRow(int[][] a, int i, int j, boolean isSmallestInRow, int k) {
		// TODO Auto-generated method stub
		if(k<a[i].length) {
			if(a[i][j]>a[i][k]){
				isSmallestInRow=false;
				return isSmallestInRow;
			}
			return loopRow(a, i, j, isSmallestInRow, k+1);
		}
		return isSmallestInRow;
	}
}
