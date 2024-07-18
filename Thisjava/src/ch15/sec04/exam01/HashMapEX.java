package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEX {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 75);
		map.put("동장군", 90);
		map.put("홍길동", 75);
		
		System.out.println("총 entry 수 : "+ map.size());
		System.out.println();
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyIterator = keyset.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			
			System.out.println(k+" : "+v);
		}
		System.out.println();
		
		
		Set<Entry<String,Integer>> entrySet =  map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String,Integer> entry= entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k+" : "+v);
			
		}
		System.out.println();

		//map 삭제
		map.remove("홍길동");
		System.out.println("총 entry 수 : "+ map.size());

		System.out.println(map);
		System.out.println();
		
	}

}
