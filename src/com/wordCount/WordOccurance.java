package com.wordCount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordOccurance {
	
	public static void main(String[] args) {
		String str="Hello world how hello pratik how are you you are fine say hello";
		
		WordCount wc=new WordCount();
		HashMap<String ,Integer> map=wc.wordCountIndividual(str);
		
		for(Map.Entry<String,Integer> mapElement:map.entrySet())
		{
			System.out.println(mapElement.getKey()+"----"+mapElement.getValue());
		}
	}

}
