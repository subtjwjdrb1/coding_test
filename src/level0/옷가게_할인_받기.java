package level0;

import java.util.stream.IntStream;

//https://school.programmers.co.kr/learn/courses/30/lessons/120815

public class 옷가게_할인_받기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(6));
		System.out.println(solution(10));
		System.out.println(solution(4));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
        int idx =1;
        int result = 0;
        while (true){
            result = 6*idx;
            if(result%n==0){
                break;
            }else{
                idx++;
            }
        }
        return idx;
    }
}
