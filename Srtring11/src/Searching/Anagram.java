package Searching;




public class Anagram {
	static String newString(String orString,String subString,int index)
	{
		String s="";
		for (int i = 0; i <orString.length() ; i++) {
			if(i==index)
			{
				s=subString+orString;
			}
			
		}
		return  s ;
	}
	
	public static void main(String[] args) {
		String orString=" dodmain";
		 String subString="sulemani";
		 int index=0;
		 String s=newString(orString,subString,index);
		System.out.println(s);
		String a[]=s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String st=a[i];
			if(st.charAt(st.length()-1)!='i')
			{
				System.out.println(st );
			}
			
			}
			
			
			
		}	
		}
	

