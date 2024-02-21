package Array;

import java.util.Arrays;

public class Arrayreverse {
	public static void main(String[] args) {
		char ch[]={'a','n','f','a','l'};
		int s=0;
		int e=ch.length-1;
		while(s<=e)
		{
			char temp=ch[s];
			ch[s]=ch[e];
			ch[e]=temp;
			e--;
			s++;
		}
		System.out.println(Arrays.toString(ch));
		
	}

}
