package Strings;

public class two {
	public static void main(String[] args){
		for(int j=100;j<=100000000;j++)
		{
		int no=j;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			int mul=1;
			for(int i=1;i<=rem;i++)
			{
				mul=mul*i;
			}
			sum=sum+mul;
			no/=10;
		}
		
		
		if(sum==copy){
			System.out.println("it is a strong number "+copy);}
//		else{
//			System.out.println("it is not a strong number "+copy);
//		}
		}
	}
}
