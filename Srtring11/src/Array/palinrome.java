package Array;

public class palinrome {
public static void main(String[] args) {
	String str="mom dad mom";
	int e=str.length()-1;
	int s=0;
	boolean flag=true;
	while(s<e)
	{
		if(str.charAt(s)!=str.charAt(e))
		{
			flag=false;
			break;
		}
		s++;
		e--;
	}
	if(flag==true)
		System.out.println("yes");
	else
		System.out.println("no");
}
}
