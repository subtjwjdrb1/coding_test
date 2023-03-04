package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120887

public class K의_개수 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(1, 13, 1));
		System.out.println(solution(10, 50, 5));
		System.out.println(solution(3, 10, 2));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int i, int j, int k) {
        int count = 0;
       while(i<=j){
           char[] a = String.valueOf(i).toCharArray();
           for(char b : a){
               if(String.valueOf(b).equals(String.valueOf(k))) count++;
           }
           i++;
       }
       return count;
   }
}
