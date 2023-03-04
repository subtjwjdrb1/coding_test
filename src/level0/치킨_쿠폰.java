package level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/120884

public class 치킨_쿠폰 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(100));
		System.out.println(solution(1081));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(int chicken) {
        return a(chicken);
    }
    public static int a(int number){
        int a = number/10;
        int b = number%10;
        if(10<=a+b){
            a += a(a+b);
        }
        return a;
    }
}
