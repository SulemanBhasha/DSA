package Searching;

import java.util.Scanner;

public class perfectnumber {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				
			}
		}
		if(sum==num)
			System.out.println("this is a perfect number");
		else
			System.out.println("this is a not a prfect number");
	}
}
