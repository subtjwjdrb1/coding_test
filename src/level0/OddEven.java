package level0;

//https://programmers.co.kr/learn/courses/30/lessons/12922

public class OddEven {
	public static void main(String[] args) {
		int [] arr = {3, 4};
		for(int i=0; i<arr.length; i++) {
			System.out.println(solution(arr[i]));
		}
	}
	
	public static String solution(int n) {
		String answer = "";
		String wm="??˜ë°?";
		if(n%2==1){
			for(int i=0;i<((n-1)/2);i++){
				answer+=wm;
		}
			answer+="???";
		}else{
			for(int i=0;i<(n/2);i++){
				answer+=wm;
			}
		}
		return answer;
	}
}
