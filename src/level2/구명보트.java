package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42885

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class 구명보트 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[]{70, 50, 80, 50}, 100));
		System.out.println(solution(new int[]{70, 80, 50}, 100));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] people, int limit) {
		Arrays.sort(people);
		int i = 0, j = people.length - 1;
		for (; i < j; --j) {
			if (people[i] + people[j] <= limit)
				++i;
		}
		return people.length - i;


//		int cnt = 0;
//		List<Integer> list = Arrays.stream(people).sorted().boxed().collect(Collectors.toList());
//		Deque<Integer> deque = new ArrayDeque<>(list);
//		while (true){
//			if(deque.size()==1){
//				cnt++;
//				break;
//			}else if(deque.size()==0){
//				break;
//			}else{
//				int min = deque.remove();
//				cnt++;
//				int size = deque.size();
//				for(int i=0; i< size; i++){
//					int max = deque.removeLast();
//					if(max+min<=limit){
//						break;
//					}else{
//						cnt++;
//					}
//				}
//			}
//		}
//
//		return cnt;
	}
}
