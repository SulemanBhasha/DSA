package Searching;

public class interchange_word {
public static void main(String[] args) {

	int arr[]={10,20,30,40,50,60,70,80};
	int key=30;
	int s=0;
	int e=arr.length-1;
	int mid=s+(e-s)/2;
	
	while(s<=e)
	{
		{
		if(arr[mid]==key)
		{
			System.out.println("the index of key elsment is "+mid);
			break;
		}
		else if(arr[mid]>key)
		{
			e=mid-1;
			
		}
		 else if(arr[mid]<key)
		{
			s=mid+1;
		}
		}
		 mid=s+(e-s)/2;
	}
	
}
}
