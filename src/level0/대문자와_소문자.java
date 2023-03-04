package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120894

public class 대문자와_소문자 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("onetwothreefourfivesixseveneightnine"));
		System.out.println(solution("onefourzerosixseven"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static long solution(String numbers) {
        return Long.parseLong(
                numbers.replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9"));
    }
}
