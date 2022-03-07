package arraysRecurtion;

public class ArraysCwQue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9};
		int start=0;
		int end=a.length;
		int num=8;
		int count=0;
		loop(a,start,end,num,count,0);
	}

	private static void loop(int[] a, int start, int end, int num,int count,int i) {
		// TODO Auto-generated method stub
		if(i<a.length) {
			int mid=(start+end)/2;
			if(a[mid]==num)
			{
				System.out.println("number found at index "+mid);
				count++;
			}
			if(num<a[mid])
				end=mid-1;
			else if(num>a[mid])
				start=mid+1;
			if(i==a.length-1)
			{
				System.out.println("number not found");
				count++;
			}
			if(count<=0)
			 loop(a, start, end, num,count, i+1);
		}
			
	}

}
