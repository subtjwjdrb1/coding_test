package level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973

import java.util.Stack;

public class 짝지어_제거하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(""));
		System.out.println(solution("a"));
		System.out.println(solution("aaaaa"));
//		System.out.println(solution("baabaa"));
//		System.out.println(solution("cdcd"));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String s){
		if(s.length()<2)return 0;
		Stack<Character> rest = new Stack<>();
		int idx = 0;
		rest.push(s.charAt(idx++));
		while(true){
			if(!rest.isEmpty()&&rest.peek()==s.charAt(idx)){
				rest.pop();
			}else {
				rest.push(s.charAt(idx));
			}
			idx++;
			if(idx==s.length())break;
		}
		return rest.size()==0?1:0;
	}
//	public static int solution(String s){
//		boolean result = true;
//		while (result){
//			result = false;
//			char [] a = s.toCharArray();
//			char temp = 0;
//			for(int i=1; i<a.length; i++){
//				if(i==1)temp = a[0];
//				if(temp==a[i]) {
//					s = s.replaceAll(s.substring(i-1,i),"");
//					result = true;
//					break;
//				}
//				temp = a[i];
//			}
//		}
//		return s.length()==0?1:0;
//	}
}
