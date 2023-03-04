package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120883

public class 로그인_성공 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new String[]{"meosseugi", "1234"},new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"programmer01", "15789"},new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(solution(new String[]{"rabbit04", "98761"},new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String solution(String[] id_pw, String[][] db) {
        if(0<Arrays.stream(db).filter(f->f[0].equals(id_pw[0])&&f[1].equals(id_pw[1])).count()){
            return "login";
        }else if(0<Arrays.stream(db).filter(f->f[0].equals(id_pw[0])).count()){
            return "wrong pw";
        }else{
            return "fail";
        }
    }
}
