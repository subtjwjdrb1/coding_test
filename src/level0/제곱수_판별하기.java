package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120906

public class 제곱수_판별하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(144));
		System.out.println(solution(976));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
        return Math.sqrt(n) == Math.floor(Math.sqrt(n)) ? 1 : 2;
    }
}
