package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120905

public class N의_배수_고르기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12}));
		System.out.println(solution(5, new int[] {1, 9, 3, 10, 13, 5}));
		System.out.println(solution(12, new int[] {2, 100, 120, 600, 12, 12}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(f-> f%n==0).toArray();
    }
}
