package stack_on_topic;
import java.util.Stack;
public class extra_Paranthasis {
	public static void main(String[] args) {
		String str="((a+b))";
		String str2="((a+b))";
		System.out.println(isDuplicate(str2));
	}
	private static boolean isDuplicate(String str) {
		Stack <Character> s=new Stack();
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch==')'){
				int count=0;
				while(!s.isEmpty() && s.peek()!='(')
				{
					s.pop();
					count++;
				}
				if(count<1){
					return true;
				}else{
					s.pop();
				}			
			}else{
				s.push(ch);
			}
		}
		return false;
	}
}

