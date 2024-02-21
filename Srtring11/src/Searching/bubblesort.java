package Searching;

import java.util.Arrays;

public class bubblesort {
public static void main(String[] args) {
	int arr[]={10,15,29,11,21,12,32,9};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[j]<arr[i])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
