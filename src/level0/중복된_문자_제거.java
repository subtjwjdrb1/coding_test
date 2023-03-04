package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120888

public class 중복된_문자_제거 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("people"));
		System.out.println(solution("We are the world"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String my_string) {
	       return Arrays.stream(my_string.split("")).distinct().reduce("", String::concat);
	    }
}
