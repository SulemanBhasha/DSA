package Strings;

public class capital {
	public static void main(String[] args) {
		String str="hello java how are you ";
		String srr[]=str.split(" " );
		for(int i=0;i<srr.length;i++)
		{
			String s="";
			String st=srr[i];
			for (int j = 0; j < st.length(); j++) {
				if(j==0)
				{
//					char  ch=st.charAt(0);
//					int no=(int)ch-32;
//					char ch1=(char)no;
//					s=s+ch1;
					
					s=s+Character.toUpperCase(st.charAt(0));
					
					
				}
				else
				{
					s=s+st.charAt(j);
				}
			}
			System.out.print(s+" ");
			}
		
				
			}
		}
		
	

