package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120923

public class 연속된_수의_합 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(3, 12));
		System.out.println(solution(5, 15));
		System.out.println(solution(4, 14));
		System.out.println(solution(5, 5));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int[] solution(int num, int total) {
        int temp = total+num;
        while (true){
            int result = total;
            int[] a = new int[num];

            for(int i = 0; i<num; i++){
                result -= (temp - i);
                a[i] = temp - i;
            }
            if(result==0){
                return a;
            }
            temp--;
        }
    }
}
