package Searching;

public class merge_sorted_array {
	public static void main(String[] args) {
		int arr1[]={1,3,5,7,8,9};
	int	arr2[]={2,4,6};
	int arr3[]=new int[arr1.length+arr2.length];
	merge(arr1,6,arr2,3,arr3);
	}

	private static void merge(int[] arr1, int n, int[] arr2, int m,int arr3[]) {		
		int i=0;
		int j=0;int k=0;
		while(i<n && j<m)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k++]=arr1[i++];
			}
			else
			{
				arr3[k++]=arr2[j++];
			}
		}
		while(i<n )
		{
			arr3[k++]=arr1[i++];
		}
		while(j<m)
		{
			arr3[k++]=arr2[j++];
		}
		for (int k2 = 0; k2 < arr3.length; k2++) {
			System.out.println(arr3[k2]);
		}
	}

}
