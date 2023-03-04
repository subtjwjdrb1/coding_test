package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120854

public class 배열_원소의_길이 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new String[] {"We", "are", "the", "world!"}));
		System.out.println(solution(new String[] {"I", "Love", "Programmers."}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}
