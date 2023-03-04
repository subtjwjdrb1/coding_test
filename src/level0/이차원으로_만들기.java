package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120842

public class 이차원으로_만들기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2));
		System.out.println(solution(new int[] {100, 95, 2, 4, 5, 6, 18, 33, 948}, 3));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[][] solution(int[] num_list, int n) {
	       int b = 0;
	        int[][] answer = new int[num_list.length/n][n];
	        for(int i =0; i< num_list.length/n; i++){
	            for(int j =0; j< n; j++){
	                
	                answer[i][j] = num_list[b++];
	            }
	        }
	        return answer;
	    }
}
