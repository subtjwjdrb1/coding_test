package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42842

import java.util.Arrays;

public class 카펫 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(36, 64));
		System.out.println(solution(10, 2));
		System.out.println(solution(8, 1));
		System.out.println(solution(24, 24));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int brown, int yellow) {
		int sum = brown + yellow;
		int y = 0, x = 0;

		for (int i = 1; i*i <= yellow; i++) {
			if (yellow % i == 0) {
				y = Math.min(i, yellow / i);
				x = Math.max(i, yellow / i);
				if ((y + 2) * (x + 2) == sum) {
					break;
				}
			}
		}

		return new int[] {x + 2, y + 2};
	}
}

