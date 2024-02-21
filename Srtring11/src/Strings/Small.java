package Strings;
public class Small {
	public static void main(String[] args) {
		String str="$jajavmava";
		String st="";
		int count=0;
		String aa="";
		String st1="";
		int sum=0;
		int sum1=0;
		for(int i=0;i<str.length();i++)
		{
		char ch=str.charAt(i);
		if(ch=='a')
		{ 
			count++;
			st=st+ch;
		}
		else
		{
			st1=st1+ch;
		}
	}
		System.out.println(st1);
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!='a')
			{
				st=st+ch;
			}
		}
		System.out.println(st);
		if(count%2==0)
		{
			for(int i=0;i<st1.length();i++)
			{
				char ch1=st1.charAt(i);
				if(i%2==0)
				{
					aa=aa+ch1;
				}
			}
			System.out.println(aa);
		}
		for(int i=0;i<2;i++)
		{
			char ch=aa.charAt(i);
			int no=(int ) ch;
			 sum=sum+no;
		}
		System.out.println("sum of first amd secomnd index number--"+sum);
			 int copy=sum;
			 while(copy>9)
			 {
				 copy=sum(copy);
			 }
			 System.out.println( " sum of first two no till single digit----"+copy);
			 if(copy%2==0)
			 {
				 int fib1=0;
				 int fib2=1;
				 System.out.print(fib1+" "+fib2);
				 for(int i=1;i<copy;i++)
				 {
					int  fib3=fib1+fib2;
					System.out.print(fib3);
					fib1=fib2;
					fib2=fib3;	 
				 }
			 }
				 for(int i=1;i<aa.length();i++)
				 {
						 char ch=aa.charAt(i);
						 int no=(int ) ch;
						 sum1=sum1+no; 
				 }
				 System.out.println("sum of first and last index number "+ sum1);
				 int copy2=sum1;
				 while(copy2>9)
				 {
					 copy2=sum(copy2);
				 }
				System.out.println("the sum of first and last =="+copy2); 
				if(copy2%2==0)
				{
					int mul=1;
					for(int i=1;i<=copy2;i++)
					{
						mul=mul*i;
					}
                	System.out.println( "the factorial of number "+mul);
				}
			 }
	static int sum(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		return sum;
	}
}
