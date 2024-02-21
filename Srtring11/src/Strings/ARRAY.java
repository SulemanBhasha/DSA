package Strings;
import java.util.Scanner;
public class ARRAY {
	static String add(String str)
	{
		 String arr=str;
		 String st="";
		 int i=str.length()-1;
		 while(i>=0)
		{
			st=st+(str.charAt(i));		
			i--;
		}
		 if(arr.equals(st))
		 {
			 return "it is a palindrome"; 
		 }
		 else
		 {
			 return " it is not a palindrome";		 
		 }
	}
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		System.out.println(add(str));
	} 

}
