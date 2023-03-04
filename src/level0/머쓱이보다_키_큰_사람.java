package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120585

public class 머쓱이보다_키_큰_사람 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {149, 180, 192, 170}, 167));
		System.out.println(solution(new int[] {180, 120, 140}, 190));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(f-> height<f).count();
    }
}
