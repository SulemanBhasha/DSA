package numbering;
import java.util.Scanner;
public class Amstrong_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enterr the number");
//		int n=sc.nextInt();
//		int sum=0;
		for( int j=100;j<1000000000;j++)
		{
			int sum=0;
		    int n=j;
		
		int copy=n;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+pow(rem,count(copy));
		    n=n/10;
		    
		}
		if(copy==sum)
		{
			System.out.println("it is  aarmstrrong------>" + copy);
		}
//		else
//		{
//			System.out.println("it is not");
//		}
	}
	}
	private static int pow(int rem, int count) {
		int mul=1;
		while(count!=0)
		{
			mul=mul*rem;
			count--;
		}
		return mul;	
	}
	private static int  count(int copy) {
		int count=0;
		while(copy!=0)
		{
			count++;
			int rem=copy%10;
			copy=copy/10;  
		}
		return count;
	}	
}
