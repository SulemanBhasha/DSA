package Array;

import java.util.HashMap;
import java.util.Map;

public class max_count {
	public static void main(String[] args) {
		System.out.println("the max count is ");
		String str = "aaaa bbb ccc  dd ddddddddd ee eeeeeeeeeeeeeeeeeee eeee";
		HashMap <Character, Integer> map =new  HashMap <Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch) && ch!=' '){
				map.put(ch, map.get(ch)+1);
			}
			else if(ch!=' ') {
				map.put(ch, 1 );
			}
			
		}
		int max_va = 0;
		System.out.println(map);
		char ch =' ';
		for (Map.Entry<Character, Integer> mapp: map.entrySet()) {
			int i =mapp.getValue();
			if(i>max_va){
				max_va=i;
				 ch = mapp.getKey();
			}
		}
		System.out.println(max_va + "::"+ ch);
			
		}
	}

