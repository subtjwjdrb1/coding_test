package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120837

public class 개미_군단 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(23));
		System.out.println(solution(24));
		System.out.println(solution(999));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int hp) {
        return hp / 5 + (hp % 5 / 3) + hp % 5 % 3;
    }
}
