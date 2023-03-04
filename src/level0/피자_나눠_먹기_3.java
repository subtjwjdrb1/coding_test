package level0;

import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120816

public class 피자_나눠_먹기_3 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(7, 10));
		System.out.println(solution(4, 12));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int slice, int n) {
        int a = n%slice==0?0:1;
        return n/slice+a;
    }
}
