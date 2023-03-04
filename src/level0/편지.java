package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120898

public class 편지 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("happy birthday!"));
		System.out.println(solution("I love you~"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String message) {
        return message.length()*2;
    }
}
