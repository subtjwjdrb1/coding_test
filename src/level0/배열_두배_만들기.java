package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120809

public class 배열_두배_만들기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
		System.out.println(solution(new int[] {1, 2, 100, -99, 1, 2, 3}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int[] numbers) {
        return Arrays.stream(numbers).map(m->m*2).toArray();
   }
}
