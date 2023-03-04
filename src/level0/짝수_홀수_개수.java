package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120824

public class 짝수_홀수_개수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
		System.out.println(solution(new int[] {1, 3, 5, 7}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int[] num_list) {
        return new int[]{(int)Arrays.stream(num_list).filter(f->f%2==0).count(), (int)Arrays.stream(num_list).filter(f->f%2==1).count()};
    }
}
