package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120882

public class 등수_매기기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}}));
		System.out.println(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}));
		System.out.println(solution(new int[][]{{1,1}, {2,1}, {3,1}, {4,1}, {5,1}, {6,1}, {7,1}, {8,1}, {9,1}, {0,0}}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int[][] score) {
		//Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).mapToInt(d -> Arrays.stream(score).map(ints -> Arrays.stream(ints).average().orElse(0)).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(d) + 1).toArray();
		List<Double> temp = Arrays.stream(score).map(m->Double.valueOf((Double.valueOf(m[0])+Double.valueOf(m[1]))/2)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		return Arrays.stream(score).map(m->temp.indexOf(Double.valueOf((Double.valueOf(m[0])+Double.valueOf(m[1]))/2))+1).mapToInt(Integer::intValue).toArray();
	}
}
