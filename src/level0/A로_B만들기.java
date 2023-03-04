package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120825

public class A로_B만들기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("hello", 3));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String my_string, int n) {
        return Arrays.stream(my_string.split("")).map(e->{
            String result = "";
            for(int i=0; i<n; i++){
                result+=e;
            }
            return result;
        }).collect(Collectors.joining());
    }
}
