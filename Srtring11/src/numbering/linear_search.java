package numbering;

public class linear_search {
public static void main(String[] args) {
	int arr[]={10,20,39,36,56,97};
	int key=56;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key )
		{
			System.out.println("key element present in index: "+i);
			break;
		}
		
	}
	
}
}
