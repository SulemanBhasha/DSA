package Searching;

import java.util.Scanner;

public class stringpalindrome {

	public static void main(String[] args) {
		System.out.println("enter trhe numer");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(palindrome(str));
		System.out.println(palindrome1(str));
	}
	static boolean palindrome(String str)
	{
		
	int i=0;
	int	j=str.length()-1;
		while(i<=j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				break;
			}
		}
		if(i>j)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
 static boolean	palindrome1(String str)
	{
	 String rev="";
	 String copy=str;
	 for(int i=str.length()-1;i>=0;i--)
	 {
		rev=rev+str.charAt(i);
		
	 }
	 if(rev.equals(copy))
	 {
		 return true;
	 }
	 else
		 return false;
		
	}
}
