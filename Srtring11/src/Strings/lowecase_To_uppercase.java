package Strings;

public class lowecase_To_uppercase {
public static void main(String[] args) {
	String s="knowledge";
	String st=s.substring(0,s.length()/2);
	String str=s.substring(s.length()/2, s.length());
	System.out.println(st);
	System.out.println(str);
	String strrev="";
	for (int i = st.length()-1; i >=0; i--) {
  char ch=st.charAt(i);
  strrev=strrev+ch;
	}
	System.out.println(strrev+str);
}
}
