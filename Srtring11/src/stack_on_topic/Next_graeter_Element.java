package stack_on_topic;
import java.util.Arrays;
import java.util.Stack;
public class Next_graeter_Element {
	public static void main(String[] args) {
		int arr[]={6,8,0,1,3};
		int arr2[]=new int[arr.length];
		
		Stack <Integer> s=new Stack();
		for (int i = arr.length-1; i >= 0; i--) {
			while(!s.isEmpty() && arr[s.peek()]<=arr[i])
			{
				s.pop();
				
			}
			if(s.empty()){
				arr2[i]=-1;
			}
			else
			{
				arr2[i]=arr[s.peek()];
			}
			s.push(i);
		}
		System.out.println(Arrays.toString(arr2));
	}
}
