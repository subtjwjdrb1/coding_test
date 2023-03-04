package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120908

public class 문자열안에_문자열 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
		System.out.println(solution("ppprrrogrammers", "pppp"));
		System.out.println(solution("AbcAbcA", "AAA"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String str1, String str2) {
        return str1.contains(str2)?1:2;
    }
}
