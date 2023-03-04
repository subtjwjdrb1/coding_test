package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120924

public class 다음에_올_숫자 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new int[] {1, 2, 3, 4}));
		System.out.println(solution(new int[] {2, 4, 8}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int[] common) {
        if(common[1]- common[0]==common[2]-common[1]){
            return common[common.length-1] + (common[1] - common[0]);
        }else {
            return common[common.length-1] * (common[1] / common[0]);
        }
    }
}
