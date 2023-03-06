package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947

import java.util.Arrays;

public class 콜라츠_추측 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(6));
		System.out.println(solution(16));
		System.out.println(solution(626331));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(long num) {
		int cnt = 0;
		while(num!=1&&cnt<500){
			cnt++;
			if(num%2==0){
				num/=2;
			}else{
				num=num*3+1;
			}
		}
		return cnt==500?num==1?cnt:-1:cnt;
	}
}
