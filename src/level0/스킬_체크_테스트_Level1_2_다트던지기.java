package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/120825

public class 스킬_체크_테스트_Level1_2_다트던지기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("1S2D*3T"));
		System.out.println(solution("1D2S#10S"));
		System.out.println(solution("1D2S0T"));
		System.out.println(solution("1S*2T*3S"));
		System.out.println(solution("1D#2S*3S"));
		System.out.println(solution("1T2D3D#"));
		System.out.println(solution("1D2S3T*"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String dartResult) {
		String [] data = dartResult.split("");
        int cal = 0;
        int []answer = new int[3];
        int idx = -1;
        for(int i = 0; i< data.length; i++){
            if(data[i].matches("\\d+")){
                if(-1<idx){
                    answer[idx] = cal;
                }
                if(data[i+1].matches("\\d+")){
                    cal = Integer.parseInt(data[i]+data[i+1]);
                    i++;
                }else{
                    cal = Integer.parseInt(data[i]);
                }
                idx++;
            }else if(data[i].equals("S")){
                Double temp = Math.pow(cal, 1);
                cal = temp.intValue();
            }else if(data[i].equals("D")){
                Double temp = Math.pow(cal, 2);
                cal = temp.intValue();
            }else if(data[i].equals("T")){
                Double temp = Math.pow(cal, 3);
                cal = temp.intValue();
            }else if(data[i].equals("*")){
                cal = cal * 2;
                if(0<idx){
                    answer[idx-1] = answer[idx-1]*2;
                }
            }else if(data[i].equals("#")){
                Double temp = Math.pow(cal, 3);
                cal = cal * -1;
            }
        }
        answer[2] = cal;
        return Arrays.stream(answer).sum();
    }
}
