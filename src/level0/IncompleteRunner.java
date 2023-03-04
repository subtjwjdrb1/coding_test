package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://programmers.co.kr/learn/courses/30/lessons/42576

public class IncompleteRunner {
	public static void main(String[] args) {
		String [][] participants = {{"leo", "kiki", "eden"},{"marina", "josipa", "nikola", "vinko", "filipa"},{"mislav", "stanko", "mislav", "ana"}};
		String[][] completions = {{"eden", "kiki"},{"josipa", "filipa", "marina", "nikola"},{"stanko", "ana", "mislav"}};
		for(int i=0; i<participants.length; i++) {
			System.out.println(solution(participants[i],completions[i]));
		}
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> lParticipant = (List<String>) Arrays.asList(participant).stream().sorted().collect(Collectors.toList());
        List<String> lCompletion = (List<String>) Arrays.asList(completion).stream().sorted().collect(Collectors.toList());
        int iCompSize = lCompletion.size();
        int idx = lParticipant.size()-1;;

        for(int i = 0; i < iCompSize ; i++ ) {
            if(!lCompletion.get(i).equals(lParticipant.get(i))) {
                idx = i;
                break;
            }
        }

        answer = lParticipant.get(idx);

        return answer;
    }
}
