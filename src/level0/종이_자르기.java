package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120922

public class 종이_자르기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(2, 2));
		System.out.println(solution(2, 5));
		System.out.println(solution(1, 1));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int M, int N) {
        return M*N -1;
    }
}
