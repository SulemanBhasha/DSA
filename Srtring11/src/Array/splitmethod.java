package Array;

import java.util.ArrayList;
import java.util.Arrays;
public class splitmethod {
	public static void main(String[] args) {
		ArrayList l1 =new ArrayList();
		String s="the sky is blue";
		int j=0;
		String ss="";
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)!=' ')
			{
				ss=ss+s.charAt(i);
			}
			else 
			{
				l1.add(ss);
				ss="";
				j++;
			}
		}
		l1.add(ss);
		String a="";
		System.out.println(l1);
	  for(int k=l1.size()-1;k>=0;k--)
	  {
		  if(k>0)
		  a=a+l1.get(k)+" ";
		  else
			  a=a+l1.get(k);
	  }
	System.out.println(a);
	char ch[]=new char[a.length()];
	for(int z=0;z<a.length() ;z++)
	{
		ch[z]=a.charAt(z);
	}
	System.out.println(Arrays.toString(ch));
	}	
}
