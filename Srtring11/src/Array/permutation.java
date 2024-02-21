package Array;

public class permutation {
	public static void main(String[] args) {
		String s1="eidbaooo";
		String s2="oo";
	     int count=0;
         String s="";
         for(int k=s2.length()-1;k>=0;k--)
         {
             s=s+s2.charAt(k);
         }
     int i=0;
     int j=1;
        String st="";
     while(j<s1.length()  )
     {
      
      st="";
            st=st+s1.charAt(i)+s1.charAt(j);
            if(st.equals(s2) || st.equals(s))
            {
                 count=1;
                 break;
            }
        i++;
        j++;
     }
    if(count==1)
    System.out.println(true);
    else
    System.out.println(false);
    }
	}


