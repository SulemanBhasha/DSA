package Searching;

public class happyNumber {
	public static void main(String[] args) {
		int num=13;
		
		while(num>9)
		{
			int sum=0;
			do{
				int rem=num%10;
				sum=sum+(rem*rem);
				num=num/10;
			}while(num!=0);
			num=sum;
		}
		if(num==1 ||num==7)
			System.out.println(     "it is a number");
		else
			System.out.println(     "it is a number4"+num);
	}
}
