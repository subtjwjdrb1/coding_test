package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120844

public class 배열_회전시키기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3}, "right"));
		System.out.println(solution(new int[] {4, 455, 5, 6, -1, 45, 6}, "left"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            answer[0] = numbers[numbers.length-1];
            for(int i=0; i<numbers.length-1; i++){
                answer[i+1] = numbers[i];
            }
        }else{
            answer[numbers.length-1] = numbers[0];
            for(int i=1; i<numbers.length; i++){
                answer[i-1] = numbers[i];
            }
        }
        return answer;
    }
}
