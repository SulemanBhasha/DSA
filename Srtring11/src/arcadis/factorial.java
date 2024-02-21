package arcadis;

public class factorial {
	
	static int fact(int n ,int m)
	{
		if(m==0)
			return 1;
		else
		{
			return n*fact(n,m-1);
		}
	}
	
public static void main(String[] args) {
	//factorail of 6
	int n=2;
	int m=2;
	System.out.println(fact(n,m));
}
}
