package Array;

public class remoove_sub_string {
public static void main(String[] args) {
	String s="yuvaraj";
	String sub="raj";
	String temp="";
	int count=0;
	for (int i = 0;i < s.length(); i++) {
		String st="";
	for (int j = i+1; j < s.length()-1; j++) {
	 st="";
		 st=st+ s.charAt(i)+s.charAt(j)+s.charAt(j+1);
		 if(st.equals(sub))
		 {
			 count++;
			 break;
		 } 
	}
	if(st.equals(sub))
	 {
		 break;
	 }	
	}
	if(count==1)
	{
		System.out.println(true);
	}
	else
	
	{
		System.out.println(false);
	}
}
}
