package Searching;

import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password");
		String s=sc.next();
		int Ucount=0;
		int Lcount=0;
		int Scount=0;
		int Ncount=0;
		if(s.length()>=8)
		{
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				if(ch>='a' && ch<='z')
				{
					Lcount++;
					
				}
				if(ch>='A' && ch<='Z')
				{
					Ucount++;
				}
				if(ch<='9' && ch>='0')
				{
					Ncount++;
				}
				else
				{
					Scount++;
				}
					
				}
			if(Scount>0 && Ncount>0 && Ucount>0 && Lcount>0 && s.charAt(s.length()-1)=='#')
			{
				System.out.println("it is a valid");
			}
			else
				{
				System.out.println("it is a invalid");
				}
			}
		else
		{
			System.out.println(" re entre password");
		}
		
		}
	}


