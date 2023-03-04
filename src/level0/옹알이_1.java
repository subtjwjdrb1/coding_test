package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120956

public class 옹알이_1 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"}));
		System.out.println(solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String[] babbling) {
        return (int) Arrays.stream(babbling).filter(f->{
            int idx = f.length();
            if(-1 < f.indexOf("aya")) idx -= 3;
            if(-1 < f.indexOf("ye")) idx -= 2;
            if(-1 < f.indexOf("woo")) idx -= 3;
            if(-1 < f.indexOf("ma")) idx -= 2;
            if(idx==0) return true;
            else return false;
        }).count();
    }
}
