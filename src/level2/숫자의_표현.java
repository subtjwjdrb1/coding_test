package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class 숫자의_표현 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(2));
//		System.out.println(solution(15));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n) {
		if(n==2)return 1;
		int answer = 0;
		int idx = 1;
		int sum=0;
		for(int i=1; i<=n; i++){
			if(sum+i==n){
				answer++;
				i = ++idx;
				sum=0;
			}else if(sum+i<n){
				sum+=i;
			}else{
				i = ++idx;
				sum=0;
			}
		}

		return answer;
	}
}
