package Array;

public class fibbonachhi {
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6};
		int arr1[]={7,8,9};
		int arr3[]=new int[arr.length+arr1.length];
	for (int i = 0; i < arr.length; i++) {
		arr3[i]=arr[i];
	}
	for (int i = 0; i < arr1.length; i++) {
		arr3[arr.length+i]=arr1[i];
	}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
	}
}
