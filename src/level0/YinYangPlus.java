package level0;

//https://programmers.co.kr/learn/courses/30/lessons/76501

public class YinYangPlus {

	public static void main(String[] args) {
		int [][] absolutes = {{4,7,12},{1,2,3}};
		boolean[][] signs = {{true,false,true},{false,false,true}};
		for(int i=0; i<absolutes.length; i++) {
			System.out.println(solution(absolutes[i],signs[i]));
		}
	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
		for(int i=0; i<absolutes.length; i++) {
			answer+= signs[i] ? absolutes[i] : absolutes[i]*-1;
		}
        return answer;
    }
}
