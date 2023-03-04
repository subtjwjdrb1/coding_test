package level0;

import java.time.LocalDate;

//https://school.programmers.co.kr/learn/courses/30/lessons/120820

public class 나이_출력 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(40));
		System.out.println(solution(23));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int age) {
        return LocalDate.now().minusYears(age).getYear();
    }
}
