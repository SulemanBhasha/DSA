package Array;

public class palindrome {
public static void main(String[] args) {
String  st="mom";
	boolean flag=true;
	int s=0;
	int e=st.length()-1;
	while(s<=e)
	{
		if(st.charAt(s)!=st.charAt(e))
		{
			flag=false;
			break;
		}
		s++;
		e--;
	}
	if(flag==true)
	{
		System.out.println("it is a palindrome");
	}
	else
	{
		System.out.println("it is not  a palindome");
	}
}
}
