package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120890

public class 가까운_수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {3, 10, 28}, 20));
		System.out.println(solution(new int[] {10, 11, 12}, 13));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] array, int n) {
       List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
       list.add(n);
       list = list.stream().sorted().collect(Collectors.toList());
       int a = list.indexOf(n);
       if(a==0) return list.get(1);
       else if(a== list.size()-1) return list.get(a-1);
       else return (list.get(a-1)-n)*-1>(list.get(a+1)-n) ? list.get(a+1) : list.get(a-1);
   }
}
