package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/42862

public class Sportswear {
	public static void main(String[] args) {
		int [] n = {5,5,3};
		int [][] losts = {{2, 4},{2, 4},{3}};
		int [][] reserves = {{1, 3, 5},{3},{1}};
		for(int i=0; i<n.length; i++) {
			System.out.println(solution(n[i], losts[i], reserves[i]));
		}
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
		List<Integer> lostList = Arrays.stream(lost).boxed().sorted().collect(Collectors.toList());
		List<Integer> reserveList = Arrays.stream(reserve).boxed().sorted().collect(Collectors.toList());
		for(int i = 1; i<=n; i++) {
			if(lostList.contains(i)) {
				if(reserveList.contains(i)) {
					reserveList.remove(reserveList.indexOf(i));
					answer++;
				}else if(reserveList.contains(i-1)){ 
					reserveList.remove(reserveList.indexOf(i-1));
					answer++;
				}else if(reserveList.contains(i+1)&&!lostList.contains(i+1)) {
					reserveList.remove(reserveList.indexOf(i+1));
					answer++;
				}
			}else {
				answer++;
			}
		}
        return answer;
    }
}
