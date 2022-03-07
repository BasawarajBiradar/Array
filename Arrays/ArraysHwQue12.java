package arraysRecurtion;

public class ArraysHwQue12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,8,7,4,5,6,3,2,1};
		int count=0;
		for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
					count++;
				}
		}
		int evenArray[]=new int[count];
		int oddArray[]=new int[a.length-count];
		int evenIndex=0;
		int oddIndex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				evenArray[evenIndex++]=a[i];
			else
				oddArray[oddIndex++]=a[i];
		}
		for(int i=0;i<evenArray.length;i++) {
			System.out.print(evenArray[i]+" ");
		}System.out.println();
		for(int i=0;i<oddArray.length;i++) {
			System.out.print(oddArray[i]+" ");
		}System.out.println();

	}

}
