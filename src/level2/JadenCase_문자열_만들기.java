package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class JadenCase_문자열_만들기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("3people        unFollowed me"));
		System.out.println(solution("for the last week"));
		System.out.println(solution("abc     d"));
		System.out.println(solution("d "));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String s) {
		String answer = "";
		String[] sp = s.toLowerCase().split("");
		boolean flag = true;

		for(String ss : sp) {
			answer += flag ? ss.toUpperCase() : ss;
			flag = ss.equals(" ") ? true : false;
		}

		return answer;
	}
}
