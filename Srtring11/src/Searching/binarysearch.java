package Searching;

public class binarysearch {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,100};
		int key=19;
		binerysearch(arr,key);
		
	}
	static void binerysearch(int arr[],int key)
	{
		int s=0;
		int e=arr.length-1;
		int mid=(s+e)-s/2;
		while(s<=e)
		{
			if(arr[mid]==key)
			{
				System.out.println("key is present--"+mid);
				break;
			}
		else if(arr[mid]<key)
			{
			s=mid+1;	
			}
		else
		{
			e=mid-1;
		}
			mid=((s+e)-s)/2;
		}
		
		
		if(s>e)
		{
		System.out.println("key is not present"+mid);	
		}
		else
			System.out.println("key is present--"+mid);
	}
	
}
