package Searching;

public class primeno {
	public static void main(String[] args) {
		
		int limit=100;
		primeTill100(limit);
		int num=10;
		boolean flag=true;
		for (int i = 2; i < num; i++) {
			if(num%i==0)
			{
				flag=false;
			}
			
		}
		if(flag==true)
		{
			System.out.println("prime number");
		}
		else
			System.out.println("not a prime");
	}
	
	static void primeTill100(int limit)
	{
		for(int i=3;i<100;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println(i);
		}
	}
}
