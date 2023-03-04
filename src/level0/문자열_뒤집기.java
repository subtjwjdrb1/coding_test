package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120822

public class 문자열_뒤집기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("jaron"));
		System.out.println(solution("bread"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}
