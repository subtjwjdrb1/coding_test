package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/87389

import java.util.stream.IntStream;

public class 나머지가_1이_되는_수_찾기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(10));
		System.out.println(solution(12));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
		return IntStream.range(2, n).filter(i -> n % i == 1).min().orElse(0);
	}
}
