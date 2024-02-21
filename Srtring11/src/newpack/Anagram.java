package newpack;


import java.util.HashMap;
import java.util.Map.Entry;

public class Anagram {
	public static void main(String[] args) {
		
		HashMap <String, Integer> l1=new HashMap<String,Integer>();
		l1.put("rohit", 123);
		l1.put("rohit1", 124);
		l1.put("rohit2", 125);
		System.out.println(l1);
		for(Entry a1:l1.entrySet())
		{
			System.out.println(a1.getKey()+" "+a1.getValue());
		}
	}
	}
