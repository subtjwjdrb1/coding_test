package level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12954


public class x만큼_간격이_있는_n개의_숫자 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(2, 5));
		System.out.println(solution(4, 3));
		System.out.println(solution(-4, 2));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static long[] solution(long x, int n) {
		if(x==0){
			long[] arr = new long[n];
			for(int i= 0; i<n;i++){
				arr[i] = 0;
			}
			return arr;
		}
		long[] arr = new long[n];
		for(int i = 1; i<= n; i++){
			arr[i-1] = x*i;
		}
		return arr;
	}
}
