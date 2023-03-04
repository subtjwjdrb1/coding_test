package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120912

public class 칠의_개수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {7, 77, 17}));
		System.out.println(solution(new int[] {10, 29}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] array) {
        return Arrays.stream(array).map(m->{
            String a = String.valueOf(m);
            int b = a.length();
            return b - String.valueOf(m).replaceAll("7","").length();
        }).sum();
    }
}
