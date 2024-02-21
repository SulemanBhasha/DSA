package Greedy_onOproblem;

import java.util.Arrays;

public class Min_absolute_difference_pairs {

	
	
	public static void main(String[] args) {
		int arr1[]={1,2,3};
		int arr2[]={2,1,3};
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		int sum=0;
		for(int i=0;i<arr1.length;i++)
		{
			sum=sum+Math.abs((arr1[i]-arr2[i]));
			
			
		}
		System.out.println(sum);
	}
}
