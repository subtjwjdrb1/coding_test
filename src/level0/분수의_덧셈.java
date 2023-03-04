package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120808

public class 분수의_덧셈 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(1, 2, 3, 4));
		System.out.println(solution(9, 2, 1, 3));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int bunza = (denum1*num2) + (denum2 * num1);
        int bunmo = num1 * num2;

        for(int i = bunmo; i>0; i--){
            if(bunza%i==0&&bunmo%i==0){
                return new int[]{bunza/i, bunmo/i};
            }
        }
        return  new int[]{bunza, bunmo};
    }
}
