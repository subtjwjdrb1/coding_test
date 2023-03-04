package level0;

//https://programmers.co.kr/learn/courses/30/lessons/12928

public class SumYaksu {
	public static void main(String[] args) {
		int n[] = {12, 5};
		for(int i=0; i<n.length; i++) {
			System.out.println(solution(n[i]));
		}
	}

	public static int solution(int n) {
		int answer = 0;
		for(int i=1; i<=(n/2);i++){
			if(n%i==0){
				answer+=i;
			
			}
		}
		return answer+n;
	}
}
