package level0;

import java.util.Arrays;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/120809

public class 스킬_체크_테스트_Level2_2_최소공배수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[]{2,6,8,14}));
		System.out.println(solution(new int[]{1,2,3}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] arr) {
		if(arr.length == 1){
            return arr[0];
        }
        int a = arr[0];
        int gcd = 0;
        for(int i = 1; i < arr.length; i++){
            int b = arr[i];
            for(int j = a*b; j > 0; j--){
                if((j%a == 0) && (j%b == 0))
                    gcd = j;
            }
            a = gcd;
        }
        return gcd;
    }
}
