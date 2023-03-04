package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120871

public class 저주의_숫자_3 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(15));
		System.out.println(solution(40));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
        int answer=0;
        for(int i=1; i<=n; i++){
            answer++;
            while (answer%3==0 || String.valueOf(answer).contains("3")){
                answer++;
            }
        }
        return answer;
    }
}
