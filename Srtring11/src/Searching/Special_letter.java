package Searching;

public class Special_letter {
	public static void main(String[] args) {
		String str="an  appl23e a day keeps+ the* doctor@ away";
		String st="";
		String s="";
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' || ch==' ')
			{
				st=st+ch;
			}
			if(((ch>='a' && ch<='z') || (ch==' ')||(ch<='Z' && ch>='A')||(ch>='0' && ch<='9'))==false)
			{
				s=s+ch;
			}
		}
		System.out.println(st);
		System.out.println(s);
	}

}
