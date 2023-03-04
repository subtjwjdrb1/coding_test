package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120841

public class 점의_위치_구하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {2, 4}));
		System.out.println(solution(new int[] {-7, 9}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        if(0<x){
            if(0 < y){
                return 1;
            }else{
                return 4;
            }
        }else{
            if(0 < y){
                return 2;
            }else{
                return 3;
            }
        }
    }
}
