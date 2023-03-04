package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120826

public class 특정_문자_제거하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("abcdef", "f"));
		System.out.println(solution("BCBdbe", "B"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
   }
}
