package arcadis;

public class sgleDigit {
	public static void main(String[] args) {
		int no=38;
		
		while(no>9)
		{
			
			int sum=0;
			do{
			
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
			}while(no!=0);
		no=sum;
	}
		System.out.println(no);
}
}