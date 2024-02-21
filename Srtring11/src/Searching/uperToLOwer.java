package Searching;

public class uperToLOwer {
	public static void main(String[] args) {
		String str="ABCD";
		String newString="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
		int no=ch+32;
		char c= (char)no;
		newString=newString+c;
		}
		System.out.println(newString);
//		count upper case letter
		int count=0;
		for(int i=0;i<newString.length();i++)
		{
		if(	Character.isLowerCase(newString.charAt(i)))
			count++;
		}
		System.out.println(count);
	}
}
