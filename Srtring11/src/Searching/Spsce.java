package Searching;

public class Spsce {
	public static void main(String[] args) {
		String str="is2 thi1s t4est 3a";
		String st[]=str.split(" ");
		int n1=0;
		String arr[]=new String[st.length];
		for (int i = 0; i < st.length; i++) {
			
			String s=st[i];
			String  n="";
			String dd="";
			for (int j = 0; j < s.length(); j++) {
				char ch=s.charAt(j);
				if(ch<='9' && ch>='0')
				{
					n=n+ch;
					n1=Integer.parseInt(n);
				}
				else
				{
					dd=dd+ch;	
				}
			}
			arr[n1-1]=dd;
		}
	
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	        }
	}

}
