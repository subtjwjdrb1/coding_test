package level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://programmers.co.kr/learn/courses/30/lessons/12926

public class CaesarCipher {
	public static void main(String[] args) {
		List<String> list = Stream.of("AB", "z", "a B z").collect(Collectors.toList());
		List<Integer> numbers = Stream.of(1, 1, 4).collect(Collectors.toList());
		for(int i=0; i<list.size(); i++) {
			System.out.println(solution(list.get(i),numbers.get(i)));
		}
	}

	public static String solution(String s, int n) {
	      char result[] = s.toCharArray();
	      for(int i=0;i<result.length;i++){
	    	  if(result[i]<='z'&&result[i]>='a'){
	    		  if((result[i]+n)>122){
	    			  result[i]=(char) (result[i]+n-122+96);
	    		  }else{
	    			  result[i]+=n;
	    		  }
	    	  }else if(result[i]<='Z'&&result[i]>='A'){
	    		  if((result[i]+n)>90){
	    			  result[i]=(char) (result[i]+n-122+96);
	    		  }else{
	    			  result[i]+=n;
	    		  }
	    	  }
	      }
	      return String.valueOf(result);
	  }
}
