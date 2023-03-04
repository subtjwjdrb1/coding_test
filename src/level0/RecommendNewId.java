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
        //1?��?�? new_id?�� ?��?�� ?��?��?��?�� ?��?��?��?�� ??�문?��?�? ?��환���?��?��.
		String answer = new_id.toLowerCase();
		//2?��?�? new_id?��??? ?�����벳 ??�문?��, ?��?��, ?��?��(-), ?���?(_), ?��침��?(.)?�� ??�외��? ?��?�� ?��?��?�� ??�거���?��?��.
        answer = answer.replaceAll("[^-_.a-z0-9]","");
        //3?��?�? new_id?��??? ?��침��?(.)?�? 2?�? ?��?�� ?��??�된 ?�??�?�� ���나?�� ?��침��?(.)?�? ?��환���?��?��.
        answer = answer.replaceAll("[.]{2,}",".");
		
        //4?��?�? new_id?��??? ?��침��?(.)?�? ?��음?��?�� ?��?�� ?��?��한?��?�� ??�거���?��?��.
        answer = answer.replaceAll("^[.]|[.]$","");
    
        //5?��?�? new_id?�? ?�? ?��?��?��?��?��?��, new_id?�� "a"?�� ?��?�����?��?��.
        if(answer.equals("")) {answer+="a";} 
        
        //6?��?�? new_id?�� ?��?��?�? 16?�� ?��?��?��?��, new_id?�� ?�� 15?��의 ?��?��?�� ??�외��? ?��?��?�? ?��?��?��?�� ?��?�� ??�거���?��?��.
        //?��약 ??�거 ��? ?��침��?(.)?�? new_id?�� ?��?�� ?��?��한?��?�� ?��?�� ?��?��한 ?��침��?(.) ?��?��?�� ??�거���?��?��.
        if(15<answer.length()) {
        	answer = answer.substring(0, 15);
       		answer = answer.replaceAll("^|[.]$","");
        }
        
        //7?��?�? new_id?�� ?��?��?�? 2?�� ?�����라?��, new_id?�� ?���??�? ?��?��?�� new_id?�� ?��?��?�? 3?�� ?�� ?��?���? ?��복���??? ?��?�� ?��입?��?��.
        if(answer.length()<3) {
        	for(int i= answer.length(); i < 3; i++) {
        		answer+=answer.charAt(answer.length()-1);
        	}
        }
        
		return answer;
  
    }
}