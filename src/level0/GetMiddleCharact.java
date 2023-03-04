package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/12903

public class GetMiddleCharact {
	public static void main(String[] args) {
		List<String> list = Stream.of("abcde", "qwer").collect(Collectors.toList());
		for(String s : list) {
			System.out.println(solution(s));
		}
	}
	
	public static String solution(String s) {
		String answer = "";
		int a=s.length();
		if(a%2==1){
			answer=s.substring((a/2),(a/2)+1);
		}else{
			answer=s.substring((a/2)-1,(a/2)-1+2);
		}
		return answer;
	 }
}
