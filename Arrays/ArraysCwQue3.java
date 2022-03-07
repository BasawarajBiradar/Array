package arraysRecurtion;

public class ArraysCwQue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,6,3,9,7,2,8};
		loop(a,0);
		display(a,0);
	}

	private static void loop(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			loop(a, i+1);
		}
	}

	private static void display(int[] a, int i) {
		// TODO Auto-generated method stub
		if(i<a.length)
			System.out.print(a[i]+" ");
		if(i<a.length)
		  display(a, i+1);	
	}
}
