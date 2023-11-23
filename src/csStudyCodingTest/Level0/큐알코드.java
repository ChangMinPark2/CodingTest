package csStudyCodingTest.Level0;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 큐알코드 {
    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++){
            if(i % q == r){
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }
    public String solution2(int q, int r, String code) {
        return IntStream.range(0, code.length()).
                filter(operand -> operand % q == r).
                mapToObj(i -> String.valueOf(code.charAt(i))).
                collect(Collectors.joining());
    }
}
