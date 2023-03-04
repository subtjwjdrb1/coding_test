package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120821

public class 삼각형의_완성조건_1 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3}));
		System.out.println(solution(new int[] {3, 6, 2}));
		System.out.println(solution(new int[] {199, 72, 222}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < (sides[1]+sides[0]) ? 1 :2;
    }
}
