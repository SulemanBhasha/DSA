package Array;

import java.util.Arrays;

public class aaa {
public static void main(String[] args) {
	String str="capTilaiZe eacH woRd";
	String st="";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch))
		{
			st=st+Character.toLowerCase(ch);
		}
		else
		{
			st=st+ch;
		}
	}
	System.out.println(st);
	String s[]=st.split(" ");
	for (int i = 0; i < s.length; i++) {
		String ss=s[i];
		String aa="";
		for (int j = 0; j < ss.length(); j++) {
			if(j==0 )
			{
				aa=aa+Character.toUpperCase(ss.charAt(0));
				
			}
			else
			{
				aa=aa+ss.charAt(j);				
			}
		}
		s[i]=aa;
	}
	System.out.println(Arrays.toString(s));
	String sss="";
	for (int i = 0; i < s.length; i++) {
		if(i!=s.length-1)
		{
			sss=sss+s[i]+" ";
		}
		else
		{
			sss=sss+s[i];
		}
	}
	System.out.println(sss+"hi");
}
}
