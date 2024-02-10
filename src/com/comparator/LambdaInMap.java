package com.comparator;

import java.util.Map;
import java.util.TreeMap;

public class LambdaInMap {

	public static void main(String[] args)
	{
		Map<Integer,String> m=new TreeMap<>();
		m.put(4,"d");
		m.put(1,"a");
		m.put(3,"c");
		m.put(2,"b");
		
		System.out.println(m);
		
		Map<Integer,String> map=new TreeMap<>((a,b)->b-a);
        map.put(10,"a");
        map.put(50,"d");
        map.put(30,"c");
        map.put(20,"b");
        
        System.out.println(map);
		
	}

}
