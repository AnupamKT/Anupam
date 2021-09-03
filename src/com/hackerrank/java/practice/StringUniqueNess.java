package com.hackerrank.java.practice;

import java.util.HashMap;
import java.util.Map;

public class StringUniqueNess {
public static void main(String[] args) {
	checkUnique("aaabbc");
}

private static void checkUnique(String str) {
	Map<Character,Integer> counter=new HashMap();
	char[] ch=str.toCharArray();

	for(int i=0;i<ch.length;i++){
		if(counter.containsKey(ch[i])){
                counter.put(ch[i], counter.get(ch[i]) + 1);
		}else{
			counter.put(ch[i],1);
		}
	}
	System.out.println(counter);
	}
}

