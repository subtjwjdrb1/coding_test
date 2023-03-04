package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120896

public class 한_번만_등장한_문자 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("abcabcadc"));
		System.out.println(solution("abdc"));
		System.out.println(solution("hello"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String s) {
        String a = Arrays.stream(s.split("")).distinct().sorted().collect(Collectors.joining());
        return Arrays.stream(a.split("")).filter(f->{
            String temp = s.replaceAll(f,"");
            if(s.length()-1==temp.length())return true;
            else return false;
        }).collect(Collectors.joining());
    }
}
