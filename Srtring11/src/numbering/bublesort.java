package numbering;

public class bublesort {
public static void main(String[] args) {
	int arr[]={ 90,23,45,67,12,23,32};
	int n=arr.length;
	int temp=0;
	for(int i=0;i<arr.length;i++)
	{
		for (int j=1;j<(n-i);j++)
		{
			if(arr[j-1]>arr[j])
			{
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
