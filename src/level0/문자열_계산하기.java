package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120902

public class 문자열_계산하기 {
	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("3 + 4"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}

	public static int solution(String my_string) {
		return Arrays.stream(my_string.replaceAll("- ", "-").replaceAll("[+] ", "").trim().split(" ")).mapToInt(Integer::parseInt).sum();
	}
}
