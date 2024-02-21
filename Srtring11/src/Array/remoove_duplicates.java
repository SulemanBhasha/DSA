package Array;

public class remoove_duplicates {
	public static void main(String[] args) {
		String s="aabbcdddcggutfjfjf";
		String st="";
		for(int i=0;i<s.length();i++)
		{
			if(st.indexOf(s.charAt(i))==-1)
			{
				st=st+s.charAt(i);
			}
		}
		System.out.println(st);
	}

}
