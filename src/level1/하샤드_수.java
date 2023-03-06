package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947

import java.util.Arrays;

public class 하샤드_수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(10));
		System.out.println(solution(12));
		System.out.println(solution(11));
		System.out.println(solution(13));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static boolean solution(int x) {
		int a = Arrays.stream(String.valueOf(x).split("")).mapToInt(Integer::parseInt).sum();
		return x%a==0;
	}
}
