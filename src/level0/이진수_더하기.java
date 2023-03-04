package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120885

public class 이진수_더하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("10", "11"));
		System.out.println(solution("1001", "1111"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String bin1, String bin2) {
		return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
	}
}
