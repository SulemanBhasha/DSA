package Searching;

public class do_while_happy_number {
	public static void main(String[] args) {
for( int i=10;i<100;i++)
{
	int no=i;
		while(no>9)
		{
			int sum=0;
			do{
				int rem=no %10;
				sum=sum+rem*rem;
				no=no/10;
			}while(no!=0);
			no=sum;
			
		}
		if(no==1||no==7)
		{
			System.out.println("it is a happy number="+ i);
		}
//		else{
//			System.out.println("it is not a happy number");
//		}
		
	}
	}

}
