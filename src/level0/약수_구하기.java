package level0;

import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120897

public class 약수_구하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(24));
		System.out.println(solution(29));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int n) {
		return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
	}
}
