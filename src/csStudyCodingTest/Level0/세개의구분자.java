package csStudyCodingTest.Level0;

import java.util.*;

public class 세개의구분자 {

    public String[] solution(String myStr) {
        String[] answer = {};

        answer = myStr.split("[abc]");

        answer = Arrays.stream(answer)
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);

        if(answer.length == 0){
            return new String[]{"EMPTY"};
        }

        return answer;
    }
}
