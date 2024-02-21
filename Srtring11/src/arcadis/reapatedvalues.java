package arcadis;

public class reapatedvalues {
   public static void main(String[] args) {
	String str="hel2lo iam2 a co2nstuctor";
	String digit="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch<='9' && ch>='0')
		{
			digit =digit+ch;
		}
	}
	System.out.println(digit);
	int d=Integer.parseInt(digit);
	int sum=0;
	while(d!=0)
	{
		int rem=d%10;
		sum=sum+rem;
		d=d/10;
		
	}
	System.out.println(sum);
}
}
