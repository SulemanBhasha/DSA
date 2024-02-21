package Searching;

public class fibonacci {

	public static void main(String[] args) {
		System.out.println("it is a fibonacci sereis");
		int f1=0;
		int f2=1;
		int n=6;
	fibonacci1(f1,f2,n);	
	}
	 static void fibonacci1(int f1,int f2,int n)
	{
		 System.out.print(f1+" "+" "+f2+" ");
		 int f3=0;
		 for(int i=0;i<n;i++)
		 {
			  f3=f1+f2;
			 System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		 }
}
}
