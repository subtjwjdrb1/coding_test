package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120850

public class 문자열_정렬하기_1 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("hi12392"));
		System.out.println(solution("p2o4i8gj2"));
		System.out.println(solution("abcde0"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}
