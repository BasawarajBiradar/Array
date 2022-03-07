package arraysRecurtion;

public class ArraysHwQue26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s[]= {'a','b','c','d','e','f'};
		char s1[]= {'p','q','r','s','t','u','v','w','x'};
		char s2[]=new char[s.length+s1.length];
		int index=0;
		loop(index,s,s1,s2,0);
		System.out.println(s2);
	}

	private static void loop(int index, char[] s, char[] s1, char[] s2, int i) {
		// TODO Auto-generated method stub
		if(i<s2.length) {
			if(i<s.length)
				s2[index++]=s[i];
			if(i<s1.length)
				s2[index++]=s1[i];
			loop(index, s, s1, s2, i+1);
		}
		
	}

}
