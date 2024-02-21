package numbering;

public class Amstong {

	public static void main(String[] args) {
		
		int no=145;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int mul=1;
			for(int i=rem;i>=1;i--)
			{
				mul=mul*i;
			}
			sum=sum+mul;
			no=no/10;
		}
		
		if(sum==copy)
		{
			System.out.println("it is a amstrong");
		}
		else 
		{
			System.out.println("it is not a amstrong number");
		}
	}
}
