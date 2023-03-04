package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120892

public class 암호_해독 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("dfjardstddetckdaccccdegk", 4));
		System.out.println(solution("pfqallllabwaoclk", 2));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String cipher, int code) {
        String[] split = cipher.split("");
        int temp = code;
        String answer = "";
        while (temp<=split.length){
            answer+=split[temp-1];
            temp+=code;
        }
        return answer;
    }
}
