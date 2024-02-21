package numbering;

public class amstrong_number1 {
	public static void main(String[] args) {
		for(int i=100;i<1000000000;i++)
		{
//		int n=i;
		int sum=0;
		int c=i;
		int v=i;
		
		String s=String.valueOf(100);
//		System.out.println(s);
		int count=s.length();
		
//		while(n!=0)
//		{
//			int rem=n%10;
//			count++;
//			n=n/10;	
//		}
		while(v!=0)
		{
			int re=v%10;
			sum=(int) (sum+Math.pow(re, count));
			v=v/10;
		}
		
		if(c==sum)
		{
			System.out.println("it is a armstrong----> "+c);
		}
		
		}
	}
	}


