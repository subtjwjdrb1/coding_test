package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120886

public class 문자_반복_출력하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("olleh", "hello"));
		System.out.println(solution("allpe", "apple"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
