package Searching;

public class vowels {
	public static void main(String[] args) {
		String str="hello we aare dd hdh jddjddjd";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String element=arr[i];
			int count=0;
			for(int j=0;j<element.length();j++)
			{
			
				char ch=element.charAt(j);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
					System.out.println(ch);	
				}
			
			}
			
			if(count>=1)
			{
				System.out.println(element);
			}
			
			
		}
	}

}
