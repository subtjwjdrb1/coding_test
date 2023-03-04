package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120839

public class 가위바위보 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("2"));
		System.out.println(solution("205"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String rsp) {
        return Arrays.stream(rsp.split("")).map(m->m.equals("2")?"0":m.equals("0")?"5":"2").collect(Collectors.joining());
    }
}
