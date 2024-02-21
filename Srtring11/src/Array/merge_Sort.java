package Array;

import java.util.Arrays;

public class merge_Sort {
	public static void main(String[] args) {
		
		int arr1[]={1,2,3,0,0,0};
		int arr2[]={4,5,6};
		int i=0;
		for (int j = 0; j < arr1.length; j++) {
			if(arr1[j]==0)
			{
				arr1[j]=arr2[i];
				i++;
			}
		}
	 Arrays.sort(arr1);
	 System.out.println(Arrays.toString(arr1));
//		for (int j = 0; j < arr1.length; j++) {
//			System.out.println(arr1[j]);
//		}
	 
	}

}
