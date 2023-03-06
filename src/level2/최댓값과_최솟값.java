package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947

import java.util.Arrays;

public class 최댓값과_최솟값 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-1 -2 -3 -4"));
		System.out.println(solution("-1 -1"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String s) {
		int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
		return a[0] + " " + a[a.length-1];
	}
}
