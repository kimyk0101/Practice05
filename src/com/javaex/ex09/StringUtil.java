package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
    	String result = "";
        
    	/*방법1. 기본적인 루프
    	for (int i = 0; i < strArray.length; ++i) {
    		result += strArray[i];
    	}*/
    	
    	/* 방법2. 향상된 For 루프
    	for (String item: strArray) {
    		result += item;
    	}*/
    	
    	/* 방법3. 문자열 배열 합치기*/
    	result = String.join("", strArray);
    	
        return result;
    }

}
