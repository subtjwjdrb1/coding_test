package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/72410

public class RecommendNewId {
	public static void main(String[] args) {
		List<String> newIds = Stream.of("...!@BaT#*..y.abcdefghijklm", "z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p").collect(Collectors.toList());
		for(String newId : newIds) {
			System.out.println(solution(newId));
		}
	}
	
	public static String solution(String new_id) {
        //1?¨?³? new_id? ?ͺ¨?  ??¬Έ??₯Ό ???? ??λ¬Έ??‘? ?Ήνϊ±©??€.
		String answer = new_id.toLowerCase();
		//2?¨?³? new_id???? ?ϊ¨λ²³ ??λ¬Έ?, ?«?, ?ΉΌ?Έ°(-), ?°μ€?(_), ?§μΉ¨ϊ­?(.)?₯Ό ??μΈϊ±? ?ͺ¨?  ?¬Έ??₯Ό ??κ±°ϊ±©??€.
        answer = answer.replaceAll("[^-_.a-z0-9]","");
        //3?¨?³? new_id???? ?§μΉ¨ϊ­?(.)?°? 2?²? ?΄? ?°??λ ?Ά??Ά? ϊ±λ? ?§μΉ¨ϊ­?(.)?‘? ?Ήνϊ±©??€.
        answer = answer.replaceAll("[.]{2,}",".");
		
        //4?¨?³? new_id???? ?§μΉ¨ϊ­?(.)?°? ?²μ?΄? ?? ??Ήν?€?©΄ ??κ±°ϊ±©??€.
        answer = answer.replaceAll("^[.]|[.]$","");
    
        //5?¨?³? new_id?°? ?Ή? ?¬Έ??΄?΄?Ό?©΄, new_id? "a"?₯Ό ??ϊ±©??€.
        if(answer.equals("")) {answer+="a";} 
        
        //6?¨?³? new_id? ?ΈΈ?΄?°? 16? ?΄??΄?©΄, new_id? ?²« 15?°μ ?¬Έ??₯Ό ??μΈϊ±? ??¨Έ?§? ?¬Έ??€? ?ͺ¨? ??κ±°ϊ±©??€.
        //?§μ½ ??κ±° ϊ·? ?§μΉ¨ϊ­?(.)?°? new_id? ?? ??Ήν?€?©΄ ?? ??Ήν ?§μΉ¨ϊ­?(.) ?¬Έ??₯Ό ??κ±°ϊ±©??€.
        if(15<answer.length()) {
        	answer = answer.substring(0, 15);
       		answer = answer.replaceAll("^|[.]$","");
        }
        
        //7?¨?³? new_id? ?ΈΈ?΄?°? 2? ?΄ϊ±λΌ?©΄, new_id? ?§μ§??§? ?¬Έ??₯Ό new_id? ?ΈΈ?΄?°? 3?΄ ?  ??Ήμ§? ?°λ³΅ϊ±΄??? ?? ?Άμ??€.
        if(answer.length()<3) {
        	for(int i= answer.length(); i < 3; i++) {
        		answer+=answer.charAt(answer.length()-1);
        	}
        }
        
		return answer;
  
    }
}
