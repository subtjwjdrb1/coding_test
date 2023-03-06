package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/86051

import java.util.Arrays;
import java.util.stream.IntStream;

public class 없는_숫자_더하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
		System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] numbers) {
		return IntStream.range(0, 9).filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
	}
}
