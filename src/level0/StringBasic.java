package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/12918

public class StringBasic {
	public static void main(String[] args) {
		List<String> list = Stream.of("a234", "1234").collect(Collectors.toList());
		for(String s : list) {
			System.out.println(solution(s));
		}
	}
	
	public static boolean solution(String s) {
		boolean answer = false;
		if(s.length()==4||s.length()==6){
			return s.chars().allMatch( Character::isDigit );
		}
		return answer;
	}	
}
