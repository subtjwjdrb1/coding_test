package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120864

public class 숨어있는_숫자의_덧셈_2 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("aAb1B2cC34oOp"));
		System.out.println(solution("1a2b3c4d123"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String my_string) {
        return Arrays.stream(my_string.split("[a-zA-Z]+"))
                .filter(s -> s.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();
        }
}
