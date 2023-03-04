package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120806

public class 두_수의_나눗셈 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(3, 2));
		System.out.println(solution(7, 3));
		System.out.println(solution(1, 16));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int num1, int num2) {
		return num1*1000/num2;
    }
}
