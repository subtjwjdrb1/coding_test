package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12911

public class 다음_큰_숫자 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(2));
		System.out.println(solution(15));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}

	public static int solution(int n) {
		int temp = Integer.bitCount(n);
		while (true){
			n++;
			if(Integer.bitCount(n)==temp)break;
		}
		return n;
	}
}
