package Array;

import java.util.Arrays;

public class bublesort {
	public static void main(String[] args) {
		int arr[]={9,7,6,5,4,3};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length-1; j++) {
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

}
