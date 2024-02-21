package Strings;
public class one{
	public static void main(String[] args) {
		String str="java@wkahandh";
		char []ch=str.toCharArray();
		
		String st="";
		 int count=0;
		for(char a1:ch)
		{
			count++;
		}
		
		
		for(int i=0;i<count;i++)
		{
			if(str.charAt(i)=='a')
			{
				st=st+str.charAt(i);
				
						
			}
		}
		System.out.println(st);
		for(int j=0;j<count;j++)
		{
			if(str.charAt(j)!='a')
			{
				st=st+str.charAt(j);
			}
		}
		System.out.println(st);
		
	}

}
