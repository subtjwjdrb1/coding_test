package level3;

//https://school.programmers.co.kr/learn/courses/30/lessons/43105

import java.util.Arrays;

public class 정수_삼각형 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[][]{{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[][] triangle) {
		for (int i = 1; i < triangle.length; i++) {
			int a1 = triangle[i][0];
			int b1 = triangle[i-1][0];
			triangle[i][0] += triangle[i-1][0];
			int a2 = triangle[i][i];
			int b2 = triangle[i-1][i-1];
			triangle[i][i] += triangle[i-1][i-1];
			for (int j = 1; j < i; j++){
				int a3 = triangle[i-1][j-1];
				int b3 = triangle[i-1][j];
				int c3 = Math.max(triangle[i-1][j-1], triangle[i-1][j]);
				int d4 = triangle[i][j];
				triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
			}
		}

		return Arrays.stream(triangle[triangle.length-1]).max().getAsInt();
	}
}

