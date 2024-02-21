package Searching;

import java.util.Arrays;

public class repeatedword {
	public static void main(String[] args) {
		System.out.println("enter the setence");
		String str="raju is a good boy and raju raju is a bad boy";
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			String element=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].equals(element) && arr[j]!="@")
				{
					count++;
					arr[j]="@";
					System.out.println(j +" "+arr[i]);
				}
			}
			if(count>1 &&arr[i]!="@")
			{
				System.out.println(i+" "+arr[i] );
				
			}
		}
	}
	

}
