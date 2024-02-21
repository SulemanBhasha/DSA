package Array;

public class knowledge {
	public static void main(String[] args) {
		String str="knowledge";
		String s="";
		for(int i=0;i<str.length()/2;i++)
		{
			s=s+str.charAt(i);
		}
		for(int i=str.length()-1;i>=str.length()/2;i--)
		{
			s=s+str.charAt(i);
		}
		System.out.println(s);
	}

}
