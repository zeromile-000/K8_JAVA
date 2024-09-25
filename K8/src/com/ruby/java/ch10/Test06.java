package com.ruby.java.ch10;

import java.util.HashMap;

public class Test06 {
	public static void main(String[] args) {
		String word[] = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"}; //key
		String meaning[] = {"굴벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"}; //value

		HashMap<String, String> dic = new HashMap<String, String>();
		
		for(int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]);
		}
		
		System.out.println(dic);
		System.out.println(dic.size()); //4
		
		System.out.println(dic.keySet()); 
		System.out.println(dic.values());
		
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주 행복한 감정");
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.replace("HEAVEN", "이상적인 세상");
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		
		System.out.println(dic.containsKey("BUMBLEBEE")); // true
		System.out.println(dic.containsValue("자장가")); //false
		
		dic.remove("HEVEN");
		System.out.println(dic.containsKey("HEVEN")); //false
		
		dic.clear();
		System.out.println(dic.isEmpty()); //true
		System.out.println(dic.size()); //0
		
		
		
		
		
		
	}

}
