package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120891

public class 삼육구게임 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(3));
		System.out.println(solution(29423));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(f-> f!=0&&f%3==0).count();
    }
}
