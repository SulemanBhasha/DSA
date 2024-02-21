package Array;

public class palindrome_special {
	public static void main(String[] args) {
		String str="1m@o#m$o&m10";
		boolean flag=true;
		int s=0;
		int e=str.length()-1;
		while(s<=e)
		{
			char ch=str.charAt(s);
			char ch1=str.charAt(e);
			
			if((ch<='z' && ch>='a') || (ch1<='z' && ch1>='a')|| (ch<='9' && ch>='0')||(ch1<='9' && ch1>='0'))
			{
				if(ch!=ch1)
				{
					flag=false;
					break;
				}
			}
			s++;
			e--;
		}
		if(flag==true)
		{
			System.out.println("it is a pal");
		}
		else
		{
			System.out.println("it is not a pal");
		}
	}

}
