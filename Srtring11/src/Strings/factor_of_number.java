package Strings;

public class factor_of_number {
public static void main(String[] args) {
	
	int n=100;
	for(int i=1;i<=n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println(i);
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
			{
				System.out.println("it is a prime factro="+i);
			}
			
		}
	}
	}
	
}

