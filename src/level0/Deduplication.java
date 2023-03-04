package level0;

import java.util.ArrayList;

//https://programmers.co.kr/learn/courses/30/lessons/12906

public class Deduplication {
	public static void main(String[] args) {
		int [][] arr = {{1,1,3,3,0,1,1},{4,4,4,3,3}};
		for(int i=0; i<arr.length; i++) {
			System.out.println(solution(arr[i]));
		}
	}
	
	public static int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer>list = new ArrayList<>();
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
        	if(arr[i-1]!=arr[i]){
        		list.add(arr[i]);
        	}
        }
        answer= new int[list.size()];
        for(int i=0;i<list.size();i++){
        	answer[i]=list.get(i);
        }
        return answer;
	}
}
