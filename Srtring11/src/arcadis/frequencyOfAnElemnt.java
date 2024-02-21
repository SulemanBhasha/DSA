package arcadis;

import java.util.ArrayList;
import java.util.Iterator;

public class frequencyOfAnElemnt {
	public static void main(String[] args) {
		int arr[]={2,3,3,4,4,4,4,4,4};
		ArrayList l1=new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j] && arr[i]!='@')
				{
					count++;
					arr[j]='@';
				}
			}
			if(count>=1 && arr[i]!='@')
			{
				System.out.println(count +"----"+arr[i]);
			}
			if(count==arr[i] && arr[i]!='@')
			{
				l1.add(arr[i]);
			}
		}
		int d=-1;
		for (int i = 0; i < l1.size(); i++) {
			d=(int)l1.get(i);
		}
		if(d==-1)
		{
			System.out.println("dont have proper frequency");
		}
		else
		{
			System.out.println(d);
		}
	}
}
