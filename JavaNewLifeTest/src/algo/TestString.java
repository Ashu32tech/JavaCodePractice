package algo;

import java.util.HashMap;
import java.util.Map;

class TestString {

 static Map<String,Integer> findDuplicateWord(String comment){
		Map<String,Integer> mp=new HashMap<>();
		String strTemp[]=comment.split(" ");
		
		for(String word:strTemp){
			Integer wordCnt=mp.get(word);
			if(wordCnt==null){
				wordCnt=0;
			}
			mp.put(word, wordCnt+1);			
		}
		return mp;
	}
   public static String reverseStr(String testStr){
	 String test="";
	 char ch[]=testStr.toCharArray();
	 for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--){
		 char temp=ch[j];
		 ch[j]=ch[i];
		 ch[i]=temp;
	 }
	 //test=ch.toString();
	 return new String(ch);
 }
	
	public static void main(String aargs[]){
		String test="aaa bbb ccc aaa bbb ccc ccc ddd";
		Map<String ,Integer> result=findDuplicateWord(test);
		System.out.println(result);
		System.out.println(reverseStr("abcde"));
	}
	
	
}
