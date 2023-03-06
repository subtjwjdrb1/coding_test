package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class 이진_변환_반복하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("110010101001"));
		System.out.println(solution("01110"));
		System.out.println(solution("1111111"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(String s) {
		int loopCnt = 0;
		int zeroCnt = 0;
		while (!s.equals("1")){
			int tempZero = s.length();
			s = s.replaceAll("0","");
			zeroCnt+=tempZero-s.length();
			s = Integer.toBinaryString(s.length());
			loopCnt++;
		}
		return new int[]{loopCnt, zeroCnt};
	}
}
