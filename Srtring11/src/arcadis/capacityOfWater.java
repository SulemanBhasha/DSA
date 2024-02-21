package arcadis;

public class capacityOfWater {
	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,9};
		int l=0;
		int r=height.length-1;
		int max=0;
		while(l<r)
		{
			int left=height[l];
			int right=height[r];
			int min=Math.min(left, right);
			int capacity=min * min;
			max=Math.max(capacity, max);
			if(l<r)
				l++;
			else
				r--;
		}
		System.out.println(max);
	}
}
