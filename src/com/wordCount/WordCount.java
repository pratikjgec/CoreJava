package com.wordCount;

import java.util.HashMap;

public class WordCount {
	
	HashMap<String , Integer> wordCountIndividual(String str)
	{	
		HashMap<String , Integer> map=new HashMap<>();
		String[] word=str.split(" ");
		for(String s:word)
		{
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		return map;
	}
}
