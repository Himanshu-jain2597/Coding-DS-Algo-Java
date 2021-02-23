/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		HashMap <String,Integer> map =  new HashMap<>();
		
		map.put("usa",200);
		map.put("india",300);
		map.put("UK",250);
		
		
		System.out.println(map);
		
		map.put("sweden",100);
		System.out.println(map);
	    map.put("india",325);  // update value of india from 300 to 325
	    System.out.println(map);

        System.out.println(map.get("india"));
        System.out.println(map.get("rsa")); // return null
        
        System.out.println(map.remove("UK"));
        
        System.out.println(map.containsKey("india"));  // true
        System.out.println(map.containsKey("UK"));    // false
        
        Set<String> keys = map.keySet();
        
        System.out.println(keys);

        Collection<Integer> values  = map.values();
        System.out.println(values);

        
	Set<Map.Entry<Character,Integer>> entries = freq.entrySet();
	}
}
