package Greedy_onOproblem;
import java.util.*;

public class Activity_Solution {

	public static void main(String[] args) {
		int[] start={1,3,0,5,8,5};// it is a starting time;
		int[]   end={2,4,6,7,9,9};// it  is sorted by ending time;
		int count=0;
		ArrayList<Integer> l1=new ArrayList();
		l1.add(0);
		count=1;
		int lastEnd=end[0];
		for(int i=1;i<end.length;i++)
		{
			if(start[i]>=lastEnd)
			{
				count++;
				l1.add(i);
				lastEnd=end[i];
			}
			
		}
		System.out.println(count);
		System.out.println(l1);
		 
		
	}
}
