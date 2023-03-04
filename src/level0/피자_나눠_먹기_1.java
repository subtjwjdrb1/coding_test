package level0;

import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120814

public class 피자_나눠_먹기_1 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(7));
		System.out.println(solution(1));
		System.out.println(solution(15));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
        return (n/7)+(n%7==0?0:1);
    }
}
