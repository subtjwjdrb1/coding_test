package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120830

public class 양꼬치 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(10, 3));
		System.out.println(solution(64, 6));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n, int k) {
        int l = 10 <= n ? n/10 : 0;
        return (n * 12000) + (k - l)* 2000;
    }
}
