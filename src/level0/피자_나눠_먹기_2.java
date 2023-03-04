package level0;

import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120818

public class 피자_나눠_먹기_2 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(150000));
		System.out.println(solution(580000));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int price) {
        return (int)(500000 <= price ? price*0.8 : 300000 <= price ? price*0.9 : 100000 <= price ? price*0.95 : price);
    }
}
