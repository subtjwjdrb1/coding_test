package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120848

public class 팩토리얼 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(3628800));
		System.out.println(solution(7));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
        int answer = 1;
        int temp = 0;

        do {
            temp++;
            answer *= temp;
        } while (answer<=n);

        return temp-1;
    }
}
