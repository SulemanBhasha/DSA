package Strings;

public class perfect_no {
public static void main(String[] args) {
	for(int j=1;j<=1000000;j++)
	{
	int no=j;
	int sum=0;
	for (int i = 1; i <=no/2; i++) {
		
		if(no%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==no)
		System.out.println("it is perfect number ="+sum);
}
}
}
