package level0;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/120869

public class 외계어_사전 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new String[] {"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"}));
		System.out.println(solution(new String[] {"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"}));
		System.out.println(solution(new String[] {"s", "o", "m", "d"}, new String[] {"moos", "dzx", "smm", "sunmmo", "som"}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static int solution(String[] spell, String[] dic) {
        int a =  (int)Arrays.stream(dic).filter(f->{
            for(int i=0; i<spell.length;i++){
                if(f.contains(spell[i])){
                    f = f.replace(spell[i],"");
                }else{
                    return false;
                }
            }
            return f.isBlank();
        }).count();
        return a==0 ?2:a;
    }
}
