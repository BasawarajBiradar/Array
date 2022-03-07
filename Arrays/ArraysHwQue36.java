package arraysRecurtion;

public class ArraysHwQue36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		int unique[]=new int[a.length-count];
		int index=0;
		for(int i=0;i<a.length;i++) {
			count=0;
			for(int j=0;j<unique.length;j++) {
				if(a[i]==unique[j])
					count++;
			}
			if(count==0)
				unique[index++]=a[i];
		}
		for(int i=0;i<unique.length;i++) {
			for(int j=i+1;j<unique.length;j++) {
				if(a[i]+a[j]==7)
					System.out.println("("+unique[i]+" "+unique[j]+")");
			}
		}
	}

}
