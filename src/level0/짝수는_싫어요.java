package level0;

import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120813

public class 짝수는_싫어요 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(10));
		System.out.println(solution(15));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
