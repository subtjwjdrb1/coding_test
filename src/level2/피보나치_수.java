package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12945

import java.util.ArrayList;
import java.util.List;

public class 피보나치_수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(3));
		System.out.println(solution(5));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
		List<Long> list = new ArrayList<>();
		list.add(0L);
		list.add(1L);
		while (true){
			long temp1 = list.get(list.size()-2);
			long temp2 = list.get(list.size()-1);
			long temp3 = temp1+temp2;
			list.add(temp3% 1234567);
			if(list.size()-1==n)break;
		}
		return list.get(n).intValue();
	}
}
