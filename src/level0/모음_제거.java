package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120849

public class 모음_제거 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("bus"));
		System.out.println(solution("nice to meet you"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String my_string) {
        return my_string.replaceAll("a|e|i|o|u", "");
    }
}
