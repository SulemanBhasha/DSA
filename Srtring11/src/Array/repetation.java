package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class repetation {
public static void main(String[] args) {
	int arr[]={1,0,2,3,4,0,4,5};
	int count=0;
	int n=arr.length;
	ArrayList l1=new ArrayList();
	for (int i = 0; count<n ; i++) 
	{
	l1.add(arr[i]);
	count++;
	 if(arr[i]==0){
		 l1.add(0);
		 count++;
	 }
	 
	}
	for (int i = 0; i <l1.size(); i++) {
		arr[i]=(Integer)l1.get(i);
		
	}
	System.out.println(Arrays.toString(arr));
	
}
}
