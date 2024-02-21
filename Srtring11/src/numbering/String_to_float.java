package numbering;

public class String_to_float {
public static void main(String[] args) {
 int n=1234;
 String d="";
 
 String s=String.valueOf(n);
 for(int i=0;i<s.length();i++)
 {
	char ch=s.charAt(i);
	System.out.println(ch);
	 if(Character.isDigit(ch))
	 {
		 d=d+ch;
	 }
 }
 System.out.println(d);
 int cv=Integer.valueOf(d);
 System.out.println(d);
 int sum=98+cv;
 System.out.println(sum);

}
}
