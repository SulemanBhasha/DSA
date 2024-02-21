package Array;

public class power_of_four {
	public static void main(String[] args) {
		int n=81;
		boolean flag=false;
		int count =0;
		for(int i=1;i<=n;i++)
		{
			if(n/3==3*i && n%3==0)
			{
				
				flag=true;
				while(n!=1){
					
					n=n/3;
					System.out.println(n);
					
					count++;
					System.out.println(count);
				}
				break;
				
			}
			else
			{
				flag=false;
			}
		}
		System.out.println(count);
		
		System.out.println(flag);
	}

}
