package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120921

public class 문자열_밀기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("hello", "ohell"));
		System.out.println(solution("apple", "elppa"));
		System.out.println(solution("atat", "tata"));
		System.out.println(solution("abc", "abc"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String A, String B) {
	       int count = 0;
	        while (true){
	            if(A.equals(B)){
	                break;
	            }
	            count++;
	            if(count==B.length()){
	                count=-1;
	                break;
	            }
	            char[] a = A.toCharArray();
	            char[] b = new char[a.length];
	            b[0] = a[a.length-1];
	            for(int i=0; i<a.length-1; i++){
	                b[i+1] = a[i];
	            }
	            A = new String(b);
	        }
	        return count;
	    }
}
