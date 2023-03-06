package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12934

public class 정수_제곱근_판별 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(121));
		System.out.println(solution(3));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static long solution(long n) {
		Double sqrt = Math.sqrt(n);
		if(sqrt.longValue()!=sqrt) return -1L;
		sqrt = Math.pow(sqrt.longValue()+1,2);
		return sqrt.longValue();
	}
}
