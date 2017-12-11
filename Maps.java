package DataStructures;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hmap=new TreeMap<Integer,String>();
		maputil(hmap);
		

	}

	private static void maputil(Map<Integer, String> hmap) {
		// TODO Auto-generated method stub
		hmap.put(45,"Local");
		hmap.put(5,"Local");
		hmap.put(415,"Local");
		hmap.put(465,"Local");
		hmap.put(345,"Local");
		hmap.put(459,"Local");
		System.out.println("Map Key-Values Pairs" +hmap.values());
		System.out.println("Map Values" +hmap.keySet());
		System.out.println("Map Key-Value Pairs" + hmap );
		System.out.println(hmap.get(345));
		for(int key:hmap.keySet())
		{
			
			System.out.println("[ The Key is "  + key + " and the Value is " + hmap + "]");
		}
	}

}
