package level0;

import java.util.Arrays;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

//https://school.programmers.co.kr/learn/courses/30/lessons/120907

public class OX퀴즈 {

	public static void main(String[] args) {
		long beforeTime = System.nanoTime();
		System.out.println(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"}));
		System.out.println(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}));
		long afterTime = System.nanoTime();
	    long secDiffTime = (afterTime - beforeTime)/1000;
	    System.out.println("시간차이(m) : "+secDiffTime);
	}
	
	public static String[] solution(String[] quiz) {
		ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        return Arrays.stream(quiz).map(m->{
            int result = 0;
            try {
                result = (int)engine.eval(m.split("=")[0]);
            } catch (ScriptException e) {
                throw new RuntimeException(e);
            }
            return Integer.parseInt(m.split("= ")[1])==result ? "O" : "X";
        }).toArray(String[]::new);
    }
}
