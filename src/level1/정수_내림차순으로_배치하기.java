package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12933

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 정수_내림차순으로_배치하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(118372	));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static long solution(long n) {
		return Long.parseLong(Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining()));
	}
}
