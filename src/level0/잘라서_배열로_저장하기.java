package level0;

import java.util.ArrayList;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/120913

public class 잘라서_배열로_저장하기 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution("abc1Addfggg4556b", 6));
		System.out.println(solution("abcdef123", 3));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String[] solution(String my_str, int n) {
      List<String> list = new ArrayList<>();
      for(int i = 0; i< my_str.length(); i=i+n){
          if(i+n < my_str.length()){
              list.add(my_str.substring(i, i+n));
          }else{
              list.add(my_str.substring(i, my_str.length()));
          }
      }
      return list.toArray(String[]::new);
  }
}
