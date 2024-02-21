package arcadis;

import java.util.Arrays;

public class meridianofanarray {
public static void main(String[] args) {
	int arr1[]={1,2};
	int arr2[]={3,4};
	int arr3[]=new int[arr1.length+arr2.length];
	int x=0;
	for(int i=0;i<arr3.length;i++)
	{
		if(i<arr1.length)
		{
			arr3[i]=arr1[i];
		}
		else
		{
			arr3[i]=arr2[x++];
		}
	}
	
	System.out.println(Arrays.toString(arr3));
	Arrays.sort(arr3);
	System.out.println(Arrays.toString(arr3));
	double meridian=-1;
	if(arr3.length%2==0)
	{
	 meridian=(double)	((arr3[(int) (arr3.length/2d)])+(arr3[(int) (arr3.length/2d-1)]))/2.00;
	}
	else
	{
		meridian =arr3[arr3.length/2];
	}
	System.out.println(meridian);
}

}
