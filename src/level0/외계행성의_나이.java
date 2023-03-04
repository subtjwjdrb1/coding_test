package level0;

import java.util.stream.Stream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120834

public class 외계행성의_나이 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(23));
		System.out.println(solution(51));
		System.out.println(solution(100));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(int age) {
        int[] arrNum = Stream.of(String.valueOf(age).split("")).mapToInt(Integer::parseInt).toArray();
        String answer = "";
        for(int i = 0; i< arrNum.length; i++){
            answer += (char)(arrNum[i] + 97);
        }
        return answer;
    }
}
