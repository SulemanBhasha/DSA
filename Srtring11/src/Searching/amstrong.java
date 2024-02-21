package Searching;

import java.util.Scanner;

public class amstrong {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		System.out.println(Amstrong(num));
		Amstrong1(num);
	}
	static boolean Amstrong(int num)
	{
		int rev=0;
		int copy=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev+(rem*rem*rem);
			num=num/10;
			
		}
		if(copy==rev)
		{
			return true;
		}
		else
			return false;
	}
	static void Amstrong1(int num)
	{
		int rev=0;
		int copy=num;
	
	 while(num!=0)
	 {
		 int rem=num%10;
		 rev=rev+multiply(count(copy),rem);
		 num=num/10;
		 
	 }
	 if(copy==rev)
		{
			System.out.println(copy +" "+ rev+ ""+ true);
		}
		else
			System.out.println(rev+" "+false+" "+count(copy));
		
	}
	static int count(int num )
	{
		int count=0;
		while(num!=0)
		{
		
			count++;
			num=num/10;
		}
		return count;
	}
	static int multiply(int count,int rem)
	{
		int mul=1;
		while(count!=0)
		{
			mul=mul*rem;
			count--;
		}
		return mul;
	}
}

