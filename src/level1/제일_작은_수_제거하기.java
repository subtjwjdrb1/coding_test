package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12935

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 제일_작은_수_제거하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[]{4, 3, 2, 1}));
		System.out.println(solution(new int[]{10}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int[] arr) {
		if(arr.length==1)return new int[]{-1};
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.remove(list.indexOf(Arrays.stream(arr).min().orElse(0)));
		return list.stream().mapToInt(i->i.intValue()).toArray();
	}
}
