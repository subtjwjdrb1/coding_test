package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947

import java.util.Arrays;

public class 올바른_괄호 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("()()"));
		System.out.println(solution("(())()"));
		System.out.println(solution(")()("));
		System.out.println(solution("(()("));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static boolean solution(String s) {
		int cntUnpair = 0;
		for (char ch : s.toCharArray()) {
			cntUnpair += ch == '(' ? 1 : -1;
			if (cntUnpair < 0) return false;
		}
		return cntUnpair == 0;
	}
}
