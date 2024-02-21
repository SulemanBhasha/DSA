package numbering;

public class Happy_number {
	public static void main(String[] args) {
		
		int num=15;
		while(num>9)
		{
			num=sum(num);
		}
		if (num==1 || num==7)
		{
			System.out.println("happy");
		}
		else
		{
			System.out.println("sad");
		}
	}

	private static int sum(int num) {
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem*rem;
			num=num/10;
		}
		return sum;
	}

}
