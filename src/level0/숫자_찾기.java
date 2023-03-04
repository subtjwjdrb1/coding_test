package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120904

public class 숫자_찾기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(29183, 1));
		System.out.println(solution(232443, 4));
		System.out.println(solution(123456, 7));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        return answer < 0 ? -1 : answer+1;
    }
}
