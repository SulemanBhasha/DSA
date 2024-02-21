package arcadis;

import java.util.Arrays;

public class bubblesort {
	static void order(int []arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	
	}
	
	
public static void main(String[] args) {
		int arr[]={10,30,13,14,9,8,3};
		order(arr);
}
}
