package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12981

import java.util.ArrayList;
import java.util.List;

public class 영어_끝말잇기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
//		System.out.println(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
//		System.out.println(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));
		System.out.println(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int n, String[] words) {
		int[] answer = new int[]{0, 0};
		int cnt = 0;
		int idx = 0;
		char last = 0;
		List<String> list = new ArrayList<>();
		while (idx!= words.length){
			cnt++;
			for(int i=0; i<n;i++){
				String word = words[idx];
				char first = word.charAt(0);
				if(idx==0||last==first){
					last = word.charAt(word.length()-1);
				}else{
					answer = new int[]{i+1, cnt};
					idx = words.length;
					break;
				}
				if(list.contains(word)){
					answer = new int[]{i+1, cnt};
					idx = words.length;
					break;
				}else{
					list.add(word);
				}
				idx++;
			}
		}
		return answer;
	}
}
