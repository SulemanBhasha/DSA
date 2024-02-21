package Strings;

public class Armstrong_number {
 static int count(int no)
 {
	 int count=0;
	 while(no!=0)
	 {
		 no=no/10;
		 count++;
	 }
	 return count;
 }
public static void main(String[] args) {
	for(int i=100;i<100000000;i++)
	{
	int no=i;
	int n=no;
     int  sum=0;
	while(no!=0)
	{
		int rem=no%10;
	sum=sum+mul(count(n),rem);
	no=no/10;
	}
	if(sum==n)
	System.out.println("it is armstrong=="+sum);
	
	
	
} }
static int mul(int count,int rem)
{
	int mul=1;
	while(count>0)
	{
		mul=mul*rem;
		count--;
	}
	return mul;
}

}
