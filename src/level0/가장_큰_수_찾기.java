package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120821

public class 가장_큰_수_찾기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 8, 3}));
		System.out.println(solution(new int[] {9, 10, 11, 8}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int[] array) {
        int i = Arrays.stream(array).max().orElse(0);
        return new int[]{i , Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(i)};
    }
}
