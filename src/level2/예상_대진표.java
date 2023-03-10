package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12985

public class 예상_대진표 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(16, 4, 5));
		System.out.println(solution(16, 9, 12));
		System.out.println(solution(8, 4, 7));
		System.out.println(solution(8, 2, 3));

		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int n, int a, int b){
		int answer = 1;
		int min = Math.min(a,b);
		int max = Math.max(a,b);
		while (true){
			int c = min%2==0?min:min+1;
			int d = max%2==0?max:max+1;
			if(c+1==d||c==d)break;
			answer++;
			min = min%2==0?min/2:(min+1)/2;
			max = max%2==0?max/2:(max+1)/2;
		}
		return answer;
	}
}
