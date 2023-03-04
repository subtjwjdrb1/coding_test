package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120910

public class 세균_증식 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(2, 10));
		System.out.println(solution(7, 15));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n, int t) {
        for(int i=0; i<t; i++){
            n*=2;
        }
        return n;
    }
}
