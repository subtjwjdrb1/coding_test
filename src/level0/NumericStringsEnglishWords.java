package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/81301

public class NumericStringsEnglishWords {
	public static void main(String[] args) {
		List<String> eNums = Stream.of("one4seveneight", "23four5six7"	, "2three45sixseven" , "123").collect(Collectors.toList());
		for(String eNum : eNums) {
			System.out.println(solution(eNum));
		}
	}
	
	public static int solution(String s) {
        String [] eNum ={
            "zero","one","two","three","four","five","six","seven","eight","nine"
        };
        for(int i=0; i<eNum.length; i++){
            if(s.contains(eNum[i])){
                 s=s.replaceAll(eNum[i],String.valueOf(i));
            }
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}
