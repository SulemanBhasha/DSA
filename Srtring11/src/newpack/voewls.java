package newpack;

import java.util.Scanner;

public class voewls {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the character"); 
//				char ch=sc.next(' ');	
				char ch=1;
		for(char i=ch;i<=ch;i++)
		{
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			 {
				 System.out.println(ch+" is itself vowels");
			 }
		else if(i<'A')
			{
				System.out.println('A');
			}
			else if(i<'E')
			{
				System.out.println('E');
			}
			else if(i<'I')
			{
				System.out.println('I');
			}
			else if(i<'O')
			{
				System.out.println('O');
			}
			else if(i<'U')
			{
				System.out.println('U');
			}
			else{
				System.out.println("there is no vowel after this later");
			}
		}
	}

}
