package Searching;

public class automorphicnumber {
public static void main(String[] args) {
	int num=434
			;
	int copy=num;
	count(num);
	
	int mul=num*num;
	if(mul%result(10,count(num))==copy)
		System.out.println(true);
	else
		System.out.println(false);
	
}

	static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	static int result(int a,int count)
	{
		int mul=1;
		while(count!=0)
		{
			mul=mul*10;
			count--;
		}
		return mul;
	}
}
