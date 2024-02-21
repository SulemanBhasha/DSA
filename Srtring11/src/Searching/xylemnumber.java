package Searching;

public class xylemnumber {
		public static void main(String[] args) {
			int num=1234;
			int copy=num;
			int sidedigit=0;
			int middledigit=0;
			while(num!=0)
			{
				if(num==copy || num<=9)
				{
					sidedigit=sidedigit+num%10;
				}
				else
				{
					middledigit=middledigit+num%10;
				}
				num=num/10;
			}
			
			if(sidedigit==middledigit)
			{
				System.out.println("it is a xylem number");
			}
			else
			{
				System.out.println("iyt is not a xylem number");
			}
			
				}
}
