package sub05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapTest {
	public static void main(String[] args) {
		//map 생성
		//k - key ,v-value 
		Map<Character, String> map = new HashMap<>();
		
		//데이터 입력
		map.put('A',"Apple");
		map.put('B',"Banana");
		map.put('C',"Cherry");
		
		System.out.println(map);
		
		//map 크기
		System.out.println("map size : "+map.size());
		
		//map 데이터 출력
		System.out.println("map A값 : "+map.get('A') );
		System.out.println("map B값 : "+map.get('B') );
		System.out.println("map C값 : "+map.get('C') );
		
		//반복문 출력  map.keySet() => key 값을 set 으로 반복
		for(char a :map.keySet()) {
			System.out.println(a + " : " + map.get(a));
		}
		
		//ArrayList응용
		Map<Integer, Apple> map1 = new HashMap<>();
		map1.put(101, new Apple("한국",3000));
		map1.put(102, new Apple("중국",2000));
		map1.put(103, new Apple("일본",1000));

		
		Map<Integer, Apple> map2 = new HashMap<>();
		map2.put(201, new Apple("미국",3000));
		map2.put(202, new Apple("영국",2000));
		map2.put(203, new Apple("호주",1000));

		
		Map<Integer, Apple> map3 = new HashMap<>();
		map3.put(301, new Apple("대만",3000));
		map3.put(302, new Apple("태국",2000));
		map3.put(303, new Apple("인도",1000));

		List<Map<Integer, Apple>> appleMaps = new ArrayList<>();
		
		appleMaps.add(map1);
		appleMaps.add(map2);
		appleMaps.add(map3);
		
		//한국사과 show()
		Map<Integer, Apple> resultmap = appleMaps.get(0);
		Apple korApple = resultmap.get(101);
		korApple.show();
		System.out.println();
		
		//태국사과 show()
		appleMaps.get(2).get(302).show();
		System.out.println();
		
		//호주사과 show()
		appleMaps.get(1).get(203).show();

		
		
		
		
	}

}
