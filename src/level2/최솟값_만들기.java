package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12941

import java.util.Arrays;

public class 최솟값_만들기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[]{1, 4, 2}, new int[]{5, 4, 4}));
		System.out.println(solution(new int[]{1,2}, new int[]{3,4}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int []A, int []B){
		Arrays.sort(A);
		Arrays.sort(B);

		int length = A.length;
		int answer = 0;

		for (int i = 0; i < length; i++) {
			answer += A[i] * B[length - 1 - i];
		}

		return answer;
	}

	public static void bubbleSort(int[] arr) {
		final int length = arr.length;
		for (int i = 0; i < length; i++) {	// 배열의 길이만큼 도는데
			for (int j = 0; j < length - i; j++) {	// 0 ~ size -1까지
				if (j + 1 < length && arr[j] > arr[j + 1]) {	// 인접한 애들끼리 계속 비교하면서 자리교체
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];
				}
			}
			// 과정 출력
			System.out.print(i+"번쨰 과정 ");
			for(int x : arr)
				System.out.print(x+" ");
			System.out.println();
		}
	}

	public static int[] selectionSort(int[] arr) {
		final int length = arr.length;
		for (int i = length-1; i >= 0; i--) {
			int min = i;

			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			// 나보다 작은게 있으면 치환
			if (min != i) {
				arr[min] = arr[min] + arr[i];
				arr[i] = arr[min] - arr[i];
				arr[min] = arr[min] - arr[i];
			}
			// 과정 출력
			System.out.print((i+1)+"번쨰 과정  : ");
			for(int x : arr)
				System.out.print(x+" ");
			System.out.println();
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		// 정렬한 순서는 0번쨰가 아닌 1번째부터다
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int position = i;
			// 자신의 바로 앞에 노드보다 값이 크기 전까지 뒤로 한칸씩 넣어줌
			while (position > 0 && key < arr[position - 1]) {
				arr[position] = arr[position - 1];
				position--;
			}

			arr[position] = key;

			// 과정 출력
			System.out.print(i+"번째 과정  : ");
			for(int x : arr)
				System.out.print(x+" ");
			System.out.println();
		}
		return arr;
	}
}
