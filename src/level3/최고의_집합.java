package level3;

//https://school.programmers.co.kr/learn/courses/30/lessons/12938

import java.util.ArrayList;
import java.util.List;

public class 최고의_집합 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(3 , 25));
		System.out.println(solution(2 , 9));
		System.out.println(solution(2 , 8));
		System.out.println(solution(2 , 1));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int n, int s) {
		if(n > s) return new int[] {-1};
		int temp = 0;
		List<Integer> list = new ArrayList<>();
		if(s%n==0){
			temp = s/n;
			for(int i = 0; i<n; i++){
				list.add(temp);
			}
		}else{
			int sum = 0;
			temp = s/n;
			for(int i = 0; i<n-1; i++){
				sum += temp;
				list.add(temp);
			}
			list.add(s-sum);
		}
		return list.stream().mapToInt(i->i.intValue()).toArray();
	}
}

