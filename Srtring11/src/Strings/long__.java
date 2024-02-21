package Strings;
public class long__ {
	static boolean add(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);		
		}
		if(rev.equals(str))
		   return true;
		else
			return false;
	}
	public static void main(String[] args) {
		String str="kanakqqa";
		int sum=0,sum1=0;
		System.out.println(add(str)); 
		if(add(str)==true)
		{
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(i%2==0)
			{
			int no=(int )ch;
			sum=sum+no;
			}	
		}
		System.out.println("sum of even index no is--"+sum);
		while(sum>9)
		{
			sum=sum(sum);
		}
		System.out.println("the sum till single digit==="+sum);
		if(sum%2==0)
		{
			int mul=1;
			for(int j=1;j<=sum;j++)
			{
				mul=mul*j;
			}
			System.out.println("factorial of single digit number=="+mul);
		}
		else
		{
			int fib1=0;
			int fib2=1;
			System.out.print(fib1+" "+fib2+" ");
			for(int i=1;i<=sum;i++)
			{
				int fib3=fib1+fib2;
				System.out.print(fib3+" ");
				fib1=fib2;
				fib2=fib3;
			}
		}
		}
		else
		{
			System.out.println("-----------false part------------");
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(i%2==1)
				{
				int no=(int )ch;
				sum1=sum1+no;
				}
			}
			System.out.println("the sum of even index character is=="+sum1);
			while(sum1>9)
			{
				sum1=sum(sum1);
			}
			System.out.println("the sum till single digit "+sum1);
			boolean flag=true;
			for(int i=2;i<sum1;i++)
			{
				if(sum1%i==0)
				{
					flag=false;
					break;	
				}
			}
			if(flag==true)
			{
				System.out.println("iy is aprime number=="+sum1);
			}
			else
			{
				System.out.println("it is not a prime number="+sum1);
				int mul=1;
				for(int i=1;i<=sum1;i++)
				{
					mul=mul*i;	
				}
				System.out.println("factorial of not prime number=="+mul);
			}
			}
	}

	
	static int sum(int sum)
	{
		int rev=0;
		while(sum!=0)
		{
			int rem=sum%10;
			rev=rev+rem;
			sum=sum/10;
		}
		return rev;
	}
	
}
