package Array;

public class merge_two_array {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int arr1[]={6,8,9,0};
		int n3=arr.length+arr1.length;
		int newarr[]=new int[n3];
		for (int i = 0; i < arr.length; i++) {
			newarr[i]=arr[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			newarr[arr.length+i]=arr1[i];	
		}
		for (int i = 0; i < newarr.length; i++) {
		System.out.println(newarr[i]);	
		}
	}
}
