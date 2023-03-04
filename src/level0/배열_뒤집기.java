package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120821

public class 배열_뒤집기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
		System.out.println(solution(new int[] {1, 1, 1, 1, 1, 2}));
		System.out.println(solution(new int[] {1, 0, 1, 1, 1, 3, 5}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int[] num_list) {
        List<Integer> collect = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(collect);
        return collect.stream().mapToInt(Integer::intValue).toArray();
    }
}
