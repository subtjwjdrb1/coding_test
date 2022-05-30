package level1;

//https://programmers.co.kr/learn/courses/30/lessons/12919

public class FindSeobang {
	public static void main(String[] args) {
		String [] arr = {"Jane", "Kim"};
		System.out.println(solution(arr));
	}
	
	public static String solution(String[] seoul) {
	     String answer = "";
			int cnt = 0;
			for (String x : seoul) {
				
				if (x.equals("Kim")) {
					return "김서방은 " + cnt + "에 있다";
				}
	            cnt++;
			}
			return answer;
	  }
}
