package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120903

public class 배열의_유사도 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"}));
		System.out.println(solution(new String[] {"n", "omg"}, new String[] {"m", "dot"}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).filter(f1-> 0 < Arrays.stream(s2).filter(f2-> f2.equals(f1)).count()).count();
    }
}
