package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/12912

public class SumBetween {
	public static void main(String[] args) {
		List<Integer> a = Stream.of(3, 3, 5).collect(Collectors.toList());
		List<Integer> b = Stream.of(5, 3, 3).collect(Collectors.toList());
		for(int i=0; i<a.size();i++) {
			System.out.println(solution(a.get(i),b.get(i)));
		}
	}
	
	public static long solution(int a, int b) {
        int temp = 0;
				 long answer = 0;
				 if(b>a){
					temp = a;
					a = b;
					b = temp;
				 }else if(a==b){
					answer=a;
					return answer;
				 }
				 answer=a+b;
				 while(++b<a){
					answer+=b;
							 }
				return answer;
    }
}
