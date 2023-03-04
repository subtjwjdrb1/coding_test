package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120845

public class 중복된_숫자_개수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 1, 1}, 1));
		System.out.println(solution(new int[] {10, 8, 6}, 3));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] box, int n) {
        return Arrays.stream(box).map(m->m/n).reduce(1, (a,b) -> a*b);
    }
}
