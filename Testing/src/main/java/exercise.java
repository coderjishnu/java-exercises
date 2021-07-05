package com.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

//1) Add these to Array list
//d1,f4,a3,b7,b2,x4,l2,f3,f1,a1,c2,b2,a4,b,a1
//2) Using streams filter all that starts with "a"
//3) Find the unique elements from filtered result using Hashset
//4) Add the unique elements from Hashset to Hashmap . ( the numeric part as key . say key of a1 is 1 )
//5) Print all elements in Hashmap
public class Main {

	public static void main(String[] args) {
		
		
		//1) Add these to Array list
		//d1,f4,a3,b7,b2,x4,l2,f3,f1,a1,c2,b2,a4,b,a1
		List<String> list = new ArrayList<String>(
				List.of(
						"d1","f4","a3","b7","b2","x4","l2","f3","f1","a1","c2","b2","a4","b","a1"));
		System.out.println("Array List: " + list);
		
		
		
		//2) Using streams filter all that starts with "a"
		List<String> filteredList = list
				.stream()
				.filter(x -> x.startsWith("a"))
				.collect(Collectors.toList());
		System.out.println("Filtered List: " + filteredList);
		
		
		
		//3) Find the unique elements from filtered result using Hashset
		Set<String> uniqueFromFiltered = new HashSet<String>(filteredList);
		System.out.println("Unique from Filtered List: " + uniqueFromFiltered);
		
		
		//4) Add the unique elements from Hashset to Hashmap . ( the numeric part as key . say key of a1 is 1 )
		Map<Integer, String> uniqueHashMap = new HashMap<Integer, String>();
		for(String x:uniqueFromFiltered)
		{
			uniqueHashMap.put(Integer.parseInt(x.substring(1)), x.substring(0, 1));
		}
		
		
		//5) Print all elements in Hashmap
		System.out.println("The HashMap: " + uniqueHashMap);

	}

