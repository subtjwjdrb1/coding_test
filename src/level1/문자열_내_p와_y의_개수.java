package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class 문자열_내_p와_y의_개수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static boolean solution(String s) {
        s = s.toUpperCase();
        int a = s.replaceAll("Y","").length();
        int b = s.replaceAll("P","").length();
        return a==b;
    }
}
