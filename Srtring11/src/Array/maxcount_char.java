package Array;

public class maxcount_char {
public static void main(String[] args) {
	String str="test is test"; char sss = 0;
	int maxcount=0;
	char arr[]=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		int count=1;
		
		for(int j=i+1;j<str.length();j++)
		{
			
			{
				if(arr[i]==arr[j] && arr[i]!='@' )
				{
					arr[j]='@';
				
				count++;
				}
			}
		}
		if(maxcount<count   && arr[i]!='@')
		{
			maxcount=count;
			sss=arr[i];
		}
	
	}
	System.out.println(maxcount+" "+sss);
	}
	
}
