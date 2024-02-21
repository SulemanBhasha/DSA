package Searching;
public class moove_zeros {
	public static void main(String[] args) {
		int arr[]={0,1,2,0,3,0,4,0,5};
		int i=0;
		for (int j=0; j<arr.length; j++) {
			if(arr[j]!=0)
			{
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}
}
