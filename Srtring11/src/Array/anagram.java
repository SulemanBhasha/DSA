package Array;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String str="listen";
		String str1="silemt";
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch1, ch))
		{
			System.out.println("it is anagram");
		}
		else
		{
			System.out.println("it is not anagram");
		}
	}
}
