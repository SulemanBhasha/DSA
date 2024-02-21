package newpack;

public class reapeted_words {
public static void main(String[] args) {
	
	String str="Big black bug bit a big black dog on his big black nose";
	String str1="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(Character.isUpperCase(ch))
		{
			str1=str1+Character.toLowerCase(ch);
		}
		else
		{
			str1=str1+ch;
		}
	}
	System.out.println(str1);
	String []arr=str1.split(" ");
	
	for(int i=0;i<arr.length;i++)
	{
		int count=1;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i].equals(arr[j])  )
		{
			count++;
			arr[j]="0";
		}
	}
	if(count>1 && arr[i]!="0")
	{
		System.out.println(arr[i] +" : "+count);
	}
	}
}
}
