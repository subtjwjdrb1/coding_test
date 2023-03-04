package level0;

//https://programmers.co.kr/learn/courses/30/lessons/12944

public class GetAverage {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4},{5,5}};
		for(int i=0; i<arr.length; i++) {
			System.out.println(solution(arr[i]));
		}
	}

	public static double solution(int[] arr) {
		double answer = 0;
		for (int x : arr) {
			answer += (double) x;
		}
		return answer / arr.length;
	}
}
