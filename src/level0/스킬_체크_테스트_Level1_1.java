package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120825

public class 스킬_체크_테스트_Level1_1 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1,1,3,3,0,1,1}));
		System.out.println(solution(new int[] {4,4,4,3,3}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int []arr) {
		return Arrays.stream(arr).distinct().toArray();
    }
}
