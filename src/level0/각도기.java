package level0;

import java.time.LocalDate;

//https://school.programmers.co.kr/learn/courses/30/lessons/120820

public class 각도기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(70));
		System.out.println(solution(91));
		System.out.println(solution(180));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int angle) {
        return angle<90 ? 1 : angle==90 ? 2 : angle < 180 ? 3 : 4 ;
    }
}
