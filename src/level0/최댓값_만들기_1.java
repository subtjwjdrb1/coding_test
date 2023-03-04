package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120847

public class 최댓값_만들기_1 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
		System.out.println(solution(new int[] {0, 31, 24, 10, 1, 9}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
        return list.get(list.size()-1)*list.get(list.size()-2);
    }
}
